package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 19/09/2015.
 */
public class CandyLifesaverTest {

    private CandyLifesaver candyLifesaver;

    @Before
    public void setUp()
    {
        candyLifesaver = new CandyLifesaver();
    }


    @Test
    public void testCandyLifesaverType()
    {
        assertEquals("I'm a Candy Lifesaver", candyLifesaver.display());
    }

    @Test
    public void testCandyLifesaverDeflatable()
    {
        assertEquals("I can't inflate!", candyLifesaver.performInflate());
        assertEquals("I can't deflate!", candyLifesaver.performeDeflate());
    }

    @Test
    public void testCandyLifesaverFloat()
    {
        assertEquals("I'm not floating!", candyLifesaver.performFloat());
    }

}
