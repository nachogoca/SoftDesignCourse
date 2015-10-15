package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleBlancoStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void setUp()
    {
        pozoleStore = new PozoleBlancoStore();
    }

    @Test
    public void pozoleBlancoPiernaTest()
    {
        pozole = pozoleStore.orderPozole("Blanco", "pierna");
        assertEquals(pozole.getName(), "Pozole blanco de pierna");
    }

    @Test
    public void pozoleBlancoVacioTest()
    {
        pozole = pozoleStore.orderPozole("Blanco", "nothing");
        assertEquals(pozole.getName(), "Pozole blanco");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleBlancoNullTest()
    {
        pozole = pozoleStore.orderPozole("Blanco", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole blanco");
    }
}
