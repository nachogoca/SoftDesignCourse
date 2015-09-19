package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflateBehaviorTest {
    private DeflateBehavior deflateBehavior;

    @Test
    public void testDeflatable() {
        deflateBehavior = new Deflatable();
        assertEquals("I'm deflating!",deflateBehavior.deflate());
        assertEquals("I'm inflating!", deflateBehavior.inflate());

    }

    @Test
    public void testNotDeflatable() {
        deflateBehavior = new NotDeflatable();
        assertEquals("I can't deflate!",deflateBehavior.deflate());
        assertEquals("I can't inflate!",deflateBehavior.inflate());

    }
}
