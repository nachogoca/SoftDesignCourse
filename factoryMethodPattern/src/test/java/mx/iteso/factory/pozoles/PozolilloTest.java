package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozolilloTest {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new Pozolillo();
    }

    @Test
    public void pozolilloTest()
    {
        assertEquals(pozole.getName(), "Pozolillo");
    }

    @Test
    public void serveTest()
    {
        assertEquals(pozole.serve(), "Serving a pozolillo to a jalisquillo");
    }
}
