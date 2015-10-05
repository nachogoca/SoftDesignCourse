package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/10/2015.
 */
public class QuesadillaTest {
    @Test
    public void testCost()
    {
        Taco taco = new Quesadilla(Taco.MEGA);
        assertEquals(16.0,taco.cost());
    }

}
