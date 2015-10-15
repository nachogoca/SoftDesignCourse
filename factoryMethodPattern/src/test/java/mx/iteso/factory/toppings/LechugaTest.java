package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoVacio;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 14/10/2015.
 */
public class LechugaTest {
    @Test
    public void lechugaTest()
    {
        Pozole lechuga = new PozoleBlancoVacio();
        lechuga = new Lechuga(lechuga);
        assertEquals(lechuga.getName(), "Pozole blanco with lechuga" );
    }
}
