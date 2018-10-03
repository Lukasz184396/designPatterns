package com.zawadalukasz.behavioral.observer;

import com.zawadalukasz.behavioral.observer.impl.CurrentConditionsDisplay;
import com.zawadalukasz.behavioral.observer.impl.WeatherData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherDataDisplayTest {
    @Test
    public void checkCurrentConditions() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(50, 25, 1000);
        String expected = "Current conditions: 50.0F degrees and 25.0 % humidity";
        assertEquals(expected, currentConditionsDisplay.display());
    }
}
