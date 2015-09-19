package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BounceBehaviorTest {

    private BounceBehavior bounceBehavior;

    @Test
    public void testCrashBounce() {
        bounceBehavior = new Crash();
        assertEquals("I crashed!! I can't bounce", bounceBehavior.bounce());
    }

    @Test
    public void testIrregularBounce()
    {
        bounceBehavior = new IrregularBounce();
        assertEquals( "I'm bouncing irregularly!", bounceBehavior.bounce());
    }

    @Test
    public void testNormalBounce()
    {
        bounceBehavior = new NormalBounce();
        assertEquals("I'm bouncing normally!", bounceBehavior.bounce());
    }
}
