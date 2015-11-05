package mx.iteso.singleton.chocolateFactory;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by Nacho on 29/10/2015.
 */
public class ChocolateBoilerTest {
    private ChocolateBoiler chocolateBoiler;
    @Before
    public void setUp()
    {
        chocolateBoiler = ChocolateBoiler.getInstance();
    }

    @Test
    public void fillTest()
    {
        chocolateBoiler.fill();
        assertFalse(chocolateBoiler.isEmpty());
    }

    @Test
    public void drain()  {
        chocolateBoiler.drain();
        assertTrue(chocolateBoiler.isEmpty());
    }

    @Test
    public void boil() {
        chocolateBoiler.boil();
        assertTrue(chocolateBoiler.isBoiled());
    }

    @Test
    public void testSingleton(){
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        assertSame(chocolateBoiler, chocolateBoiler2);
    }

    @Test
    public void multithreatedSingleton() {
        
    }


    private static class Task implements Runnable   {

        private CyclicBarrier cyclicBarrier;


        public Task (CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed barrier");
            } catch (InterruptedException e) {
                Logger.getLogger(CyclicBarrier.class.getName()).log(Level.SEVERE, null, e);
            } catch (BrokenBarrierException e) {
                Logger.getLogger(CyclicBarrier.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
