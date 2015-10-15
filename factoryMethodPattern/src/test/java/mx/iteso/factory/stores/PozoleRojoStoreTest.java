package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleRojoStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void setUp()
    {
        pozoleStore = new PozoleRojoStore();
    }

    @Test
    public void pozoleRojoPolloTest()
    {
        pozole = pozoleStore.orderPozole("Rojo", "pollo");
        assertEquals(pozole.getName(), "Pozole Rojo con Pollo");
    }

    @Test
    public void pozoleRojoCacheteTest()
    {
        pozole = pozoleStore.orderPozole("Rojo", "cachete");
        assertEquals(pozole.getName(), "Pozole Rojo con Cachete");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleRojoNullTest()
    {
        pozole = pozoleStore.orderPozole("Rojo", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole");
    }
}
