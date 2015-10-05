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
public class PastorTest {
    private Taco taco;

    @Before
    public void setUp() { taco = mock(Taco.class); }

    @Test
    public void testGetDescription()
    {
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        assertEquals("Taco Normal de pastor", pastor.getDescription());
    }

    @Test
    public void testCost()
    {
        Taco pastor = new TacoNormal(Taco.MINI);
        pastor = new Pastor(pastor);
        assertEquals(9.5, pastor.cost());
    }
}
