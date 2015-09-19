package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 19/09/2015.
 */
public class HitBehaviorTest {
    @Test
    public void testHeavyHit()
    {
        HeavyHit heavyHit = new HeavyHit();
        assertEquals("It is a heavy Hit!", heavyHit.hit());
    }

    @Test
    public void testNormalHit()
    {
        NormalHit normalHit = new NormalHit();
        assertEquals("It is a normal Hit!", normalHit.hit());
    }

    @Test
    public void testLightHit()
    {
        LightHit lightHit = new LightHit();
        assertEquals("It is a light Hit",lightHit.hit());
    }

}
