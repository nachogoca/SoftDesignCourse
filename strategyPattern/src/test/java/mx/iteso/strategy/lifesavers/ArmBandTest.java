package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 19/09/2015.
 */
public class ArmBandTest {

    private ArmBand armBand;

    @Before
    public void setUp()
    {
        armBand = new ArmBand();
    }


    @Test
    public void testArmBandType()
    {
        assertEquals("I'm a Arm band",armBand.display());
    }

    @Test
    public void testArmBandDeflatable()
    {
        assertEquals("I'm inflating!",armBand.performInflate());
        assertEquals("I'm deflating!",armBand.performeDeflate());
    }

    @Test
    public void testArmBandFloat()
    {
        assertEquals("I'm floating!",armBand.performFloat());
    }
}
