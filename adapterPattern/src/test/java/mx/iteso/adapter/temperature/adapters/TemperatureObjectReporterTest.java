package mx.iteso.adapter.temperature.adapters;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/11/2015.
 */
public class TemperatureObjectReporterTest {
    TemperatureObjectReporter temperatureObjectReporter;

    @Before
    public void setUp()
    {
        temperatureObjectReporter = new TemperatureObjectReporter();
    }

    @Test
    public void celsiusToFahrenheitTest()
    {
        temperatureObjectReporter.setTemperatureInCelsius(0);
        assertEquals(temperatureObjectReporter.getTemperatureInFahrenheit(), 32.0);
    }

    @Test
    public void fahrToCelsiusTest()
    {
        temperatureObjectReporter.setTemperatureInFahrenheit(85.0);
        assertEquals(temperatureObjectReporter.getTemperatureInCelsius(), 29.444444444444443);

    }
}
