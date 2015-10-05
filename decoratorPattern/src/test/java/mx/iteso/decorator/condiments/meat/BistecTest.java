package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Queso;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nacho on 04/10/2015.
 */
public class BistecTest {
    private Taco taco;

    @Before
    public void setUp() { taco = mock(Taco.class); }

    @Test
    public void testGetDescription()
    {
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        assertEquals("Taco Normal de bistec", bistec.getDescription());
    }

    @Test
    public void testCost()
    {
        Taco bistec = new TacoNormal(Taco.REGULAR);
        bistec = new Bistec(bistec);
        assertEquals(12.0, bistec.cost());
    }

}
