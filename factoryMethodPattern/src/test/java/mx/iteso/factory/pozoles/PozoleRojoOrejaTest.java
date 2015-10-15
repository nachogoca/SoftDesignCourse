package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleRojoOrejaTest {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleRojoOreja();
    }

    @Test
    public void pozoleRojoOrejaTest()
    {
        assertEquals(pozole.getName(), "Pozole Rojo con Oreja" );
    }

}
