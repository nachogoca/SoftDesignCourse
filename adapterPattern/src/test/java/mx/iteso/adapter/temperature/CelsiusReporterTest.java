package mx.iteso.adapter.temperature;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/11/2015.
 */
public class CelsiusReporterTest {
    CelsiusReporter celsiusReporter;

    @Before
    public void setUp()
    {
        celsiusReporter = new CelsiusReporter();
    }

    @Test
    public void stupidTest()
    {
        celsiusReporter.setTemperatureInCelsius(3.14);
        assertEquals(celsiusReporter.getTemperatureInCelsius(), 3.14);
    }
}
