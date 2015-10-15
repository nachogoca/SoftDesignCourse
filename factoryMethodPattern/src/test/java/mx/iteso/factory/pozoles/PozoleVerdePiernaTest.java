package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class PozoleVerdePiernaTest {
    Pozole pozole;

    @Before
    public void setUo()
    {
        pozole = new PozoleVerdePierna();
    }

    @Test
    public void pozoleVerfePiernaTest()
    {
        assertEquals(pozole.getName(), "Pozole Verde con Pierna");
    }
}
