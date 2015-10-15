package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleBlancoPiernaTest {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleBlancoPierna();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole blanco de pierna");
    }
}
