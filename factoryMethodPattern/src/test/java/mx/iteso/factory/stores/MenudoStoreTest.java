package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class MenudoStoreTest {
    PozoleStore pozoleStore;

    @Test
    public void createPozoleTest()
    {
        pozoleStore = new MenudoStore();
        Pozole pozole = pozoleStore.orderPozole("Menudo", "meat");
        assertEquals(pozole.getName(), "Menudo");
    }
}
