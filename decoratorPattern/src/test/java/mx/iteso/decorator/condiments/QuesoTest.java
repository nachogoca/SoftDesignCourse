package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nacho on 04/10/2015.
 */
public class QuesoTest {
    private Taco taco;

    @Before
    public void setUp() { taco = mock(Taco.class); }

    @Test
    public void testGetDescription()
    {
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        assertEquals("Taco Normal con queso", queso.getDescription());
    }

    @Test
    public void testCost()
    {
        Taco queso = new TacoNormal(Taco.REGULAR);
        queso = new Queso(queso);
        assertEquals(13.0, queso.cost());
    }
}
