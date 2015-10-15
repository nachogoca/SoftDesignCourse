package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoVacio;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class LimonTest {
    @Test
    public void limonTest()
    {
        Pozole limon = new PozoleBlancoVacio();
        limon = new Limon(limon);
        assertEquals(limon.getName(), "Pozole blanco with limón" );
    }
}
