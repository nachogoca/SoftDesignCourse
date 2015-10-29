package mx.iteso.singleton.tables;

import mx.iteso.singleton.TableOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by Nacho on 28/10/2015.
 */
public class Table1Test {
    private TableOrder tableOrder;

    @Before
    public void setUp() {
        tableOrder = Table1.getInstance();
    }

    @Test
    public void singletonTest()
    {
        TableOrder tableOrderExactCopy = Table1.getInstance();
        assertSame(tableOrder, tableOrderExactCopy);
    }

    @Test
    public void clearOrderTest()
    {
        Table1.clearOrder();
        // Extract another instance that has to be different from the original
        TableOrder tableOrderClean = Table1.getInstance();
        assertNotSame(tableOrder, tableOrderClean);
    }

    @Test
    public synchronized void testSynch() throws Exception {
        int num = 2;
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(num);

        Table1.clearOrder();
        Thread[] instances = new Thread[num];
        for (int i = 0; i < num; i++) {
            instances[i] = new Thread(new MySingleton(startSignal, doneSignal));
            instances[i].start();
        }

        startSignal.countDown();
        doneSignal.await();
        for (int i = 0; i < num; i++) {
            for (int j = i; j < instances.length; j++) {
                if (instances[i] != instances[j])
                {
                    throw (new Exception());
                }
            }
        }
    }

    class MySingleton implements Runnable {
        TableOrder table1;
        CountDownLatch startSignal;
        CountDownLatch doneSignal;

        public MySingleton(CountDownLatch startSignal, CountDownLatch doneSignal) {
            this.table1 = null;
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }

        public Table1 getTable()
        {
            return (Table1)table1;
        }

        @Override
        public void run() {
            try {
                startSignal.await();
                table1 = Table1.getInstance();
                doneSignal.countDown();
                System.out.println("----------------------------------------->");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
