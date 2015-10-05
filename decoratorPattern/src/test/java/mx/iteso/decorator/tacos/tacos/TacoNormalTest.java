package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void testCost() {
        Taco taco = new TacoNormal(Taco.REGULAR);
        assertEquals(10.0, taco.cost(),0);
    }

    @Test
    public void testTacoDescription()
    {
        Taco taco = new TacoNormal(Taco.MEGA);
        assertEquals("Taco normal, tamaño Mega, ", taco.getDescription());
    }
}
