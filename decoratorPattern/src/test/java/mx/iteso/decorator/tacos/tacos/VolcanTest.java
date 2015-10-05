package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/10/2015.
 */
public class VolcanTest {
    @Test
    public void testCost()
    {
        Taco taco = null;
        try {
             taco = new Volcan(Taco.REGULAR);
        } catch (InvalidTacoSize invalidTacoSize) {
            invalidTacoSize.printStackTrace();
        }
        assertEquals(18.0, taco.cost());
    }

    @Test(expected = InvalidTacoSize.class)
    public void testInvalidSize() throws InvalidTacoSize {
        Taco taco = new Volcan(Taco.MINI);
    }
}
