package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleRojoCacheteTest {
    Pozole pozole;
    @Before
    public void setUp()
    {
        pozole = new PozoleRojoCachete();
    }

    @Test
    public void pozoleRojoCachete()
    {
        assertEquals(pozole.getName(), "Pozole Rojo con Cachete");
    }
}
