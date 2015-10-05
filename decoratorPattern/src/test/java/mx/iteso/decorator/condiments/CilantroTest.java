package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nacho on 04/10/2015.
 */
public class CilantroTest {
    private Taco taco;

    @Before
    public void setUp() { taco = mock(Taco.class); }

    @Test
    public void testGetDescription()
    {
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        assertEquals("Taco Normal con cilantro", cilantro.getDescription());
    }

    @Test
    public void testCost()
    {
        Taco cilantro = new Cilantro(taco);
        when(taco.cost()).thenReturn(8.0);
        assertEquals(8.0, cilantro.cost());
    }
}

