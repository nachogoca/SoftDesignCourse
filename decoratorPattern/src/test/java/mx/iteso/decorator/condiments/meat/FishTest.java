package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/10/2015.
 */
public class FishTest {
    private Taco taco;
    @Test
    public void testGetDescription()
    {
        taco = new TacoNormal(Taco.REGULAR);
        try {
            taco = new Fish(taco);
        } catch (InvalidTacoSize invalidTacoSize) {
            invalidTacoSize.printStackTrace();
        }
        assertEquals("Taco normal, tamaño Regular, de pescado",taco.getDescription());
    }

    @Test
    public void testCost()
    {
        taco = new TacoNormal(Taco.MEGA);
        try {
            taco = new Fish(taco);
        } catch (InvalidTacoSize invalidTacoSize) {
            invalidTacoSize.printStackTrace();
        }
        assertEquals(14.5 + Math.PI , taco.cost());
    }

    @Test(expected = InvalidTacoSize.class)
    public void testInvalidSize() throws InvalidTacoSize
    {
        taco = new TacoNormal(Taco.MINI);
        taco = new Fish(taco);
    }
}
