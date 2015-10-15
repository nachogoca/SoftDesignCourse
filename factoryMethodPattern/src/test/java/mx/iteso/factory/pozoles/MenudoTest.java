package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nacho on 13/10/2015.
 */
public class MenudoTest {
    Pozole menudo;

    @Before
    public void setUp()
    {
        menudo = new Menudo();
    }

    @Test
    public void serveTest()
    {
        String served = menudo.serve();
        assertEquals("Serving xtra hot in special menudo plate...", served);
    }
}
