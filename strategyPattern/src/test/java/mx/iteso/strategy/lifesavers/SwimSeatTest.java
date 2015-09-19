package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 19/09/2015.
 */
public class SwimSeatTest {
    private SwimSeat swimSeat;

    @Before
    public void setUp()
    {
        swimSeat = new SwimSeat();
    }

    @Test
    public void testSwimSeatType()
    {
        assertEquals("I'm a Swim seat",swimSeat.display());
    }

    @Test
    public void testSwimSeatDeflatable()
    {
        assertEquals("I'm inflating!",swimSeat.performInflate());
        assertEquals("I'm deflating!",swimSeat.performeDeflate());
    }

    @Test
    public void testSwimSeatFloat()
    {
        assertEquals("I'm floating!",swimSeat.performFloat());
    }
}
