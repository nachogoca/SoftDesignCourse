package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleVerdeStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void setUp()
    {
        pozoleStore = new PozoleVerdeStore();
    }

    @Test
    public void pozoleVerdePolloTest()
    {
        pozole = pozoleStore.orderPozole("Verde", "pollo");
        assertEquals(pozole.getName(), "Pozole Verde con Pollo");
    }

    @Test
    public void pozoleVerdeCacheteTest()
    {
        pozole = pozoleStore.orderPozole("Verde", "cachete");
        assertEquals(pozole.getName(), "Pozole Verde con Cachete");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleVerdeNullTest()
    {
        pozole = pozoleStore.orderPozole("Verde", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole");
    }
}
