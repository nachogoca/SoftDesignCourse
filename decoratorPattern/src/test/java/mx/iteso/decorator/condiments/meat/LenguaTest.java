package mx.iteso.decorator.condiments.meat;

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
public class LenguaTest {
    private Taco taco;

    @Before
    public void setUp() { taco = mock(Taco.class); }

    @Test
    public void testGetDescription()
    {
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        assertEquals("Taco Normal de lengua", lengua.getDescription());
    }

    @Test
    public void testCost()
    {
        Taco lengua = new TacoNormal(Taco.MINI);
        lengua = new Lengua(lengua);
        assertEquals(11.5, lengua.cost());
    }
}
