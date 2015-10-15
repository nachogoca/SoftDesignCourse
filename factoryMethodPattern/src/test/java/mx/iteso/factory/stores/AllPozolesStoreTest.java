package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class AllPozolesStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void setUo()
    {
        pozoleStore = new AllPozolesStore();
    }

    @Test
    public void pozoleBlancoPiernaTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Blanco", "pierna");
        assertEquals(pozole.getName(), "Pozole blanco de pierna");
    }

    @Test
    public void pozoleBlancoVacioTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Blanco", "nothing");
        assertEquals(pozole.getName(), "Pozole blanco");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleBlancoNullTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Blanco", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole blanco");
    }

    @Test
    public void pozoleRojoPolloTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Rojo", "pollo");
        assertEquals(pozole.getName(), "Pozole Rojo con Pollo");
    }

    @Test
    public void pozoleRojoCacheteTest()
    {
        pozole = pozoleStore.orderPozole("Menudo", "nothing");
        assertEquals(pozole.getName(), "Menudo");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleRojoNullTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Rojo", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole");
    }

    @Test
    public void pozoleVerdePolloTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Verde", "pollo");
        assertEquals(pozole.getName(), "Pozole Verde con Pollo");
    }

    @Test
    public void pozolilloTest()
    {
        pozole = pozoleStore.orderPozole("Pozolillo", "pierna");
        assertEquals(pozole.getName(), "Pozolillo");
    }

    @Test(expected = NullPointerException.class)
    public void pozoleVerdeNullTest()
    {
        pozole = pozoleStore.orderPozole("Pozole Morado", "inexistent meat");
        assertEquals(pozole.getName(), "Pozole");
    }
}
