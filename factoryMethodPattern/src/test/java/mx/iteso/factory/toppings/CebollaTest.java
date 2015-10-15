package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoVacio;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class CebollaTest {
    @Test
    public void cebollaTest()
    {
        Pozole cebolla = new PozoleBlancoVacio();
        cebolla = new Cebolla(cebolla);
        assertEquals(cebolla.getName(), "Pozole blanco with cebolla" );
    }


}
