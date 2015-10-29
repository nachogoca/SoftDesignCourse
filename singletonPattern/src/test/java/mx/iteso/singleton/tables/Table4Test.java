package mx.iteso.singleton.tables;

import mx.iteso.singleton.TableOrder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by Nacho on 28/10/2015.
 */
public class Table4Test {
    private TableOrder tableOrder;

    @Before
    public void setUp() {
        tableOrder = Table4.getInstance();
    }

    @Test
    public void singletonTest()
    {
        TableOrder tableOrderExactCopy = Table4.getInstance();
        assertSame(tableOrder, tableOrderExactCopy);
    }

    @Test
    public void clearOrderTest()
    {
        Table4.clearOrder();
        // Extract another instance that has to be different from the original
        TableOrder tableOrderClean = Table4.getInstance();
        assertNotSame(tableOrder, tableOrderClean);
    }
}
