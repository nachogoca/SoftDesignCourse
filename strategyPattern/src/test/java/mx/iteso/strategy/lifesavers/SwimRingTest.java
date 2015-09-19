package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 19/09/2015.
 */
public class SwimRingTest {
    private SwimRing swimRing;

    @Before
    public void setUp()
    {
        swimRing = new SwimRing();
    }


    @Test
    public void testSwimRingType()
    {
        assertEquals("I'm a Swim ring",swimRing.display());
    }

    @Test
    public void testSwimRingDeflatable()
    {
        assertEquals("I'm inflating!",swimRing.performInflate());
        assertEquals("I'm deflating!",swimRing.performeDeflate());
    }

    @Test
    public void testSwimRingFloat()
    {
        assertEquals("I'm floating!",swimRing.performFloat());
    }
    
}
