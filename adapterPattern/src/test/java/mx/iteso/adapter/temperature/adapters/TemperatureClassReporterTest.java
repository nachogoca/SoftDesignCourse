package mx.iteso.adapter.temperature.adapters;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/11/2015.
 */
public class TemperatureClassReporterTest {
    TemperatureClassReporter temperatureClassReporter;

    @Before
    public void setUp()
    {
        temperatureClassReporter = new TemperatureClassReporter();
    }

    @Test
    public void celsiusToFahrenheitTest()
    {
        temperatureClassReporter.setTemperatureInCelsius(0);
        assertEquals(temperatureClassReporter.getTemperatureInFahrenheit(), 32.0);
    }

    @Test
    public void fahrToCelsiusTest()
    {
        temperatureClassReporter.setTemperatureInFahrenheit(85.0);
        assertEquals(temperatureClassReporter.getTemperatureInCelsius(), 29.444444444444443);

    }

}
