package com.zawadalukasz.behavioral.observer;

import com.zawadalukasz.behavioral.observer.impl.CurrentConditionsDisplay;
import com.zawadalukasz.behavioral.observer.impl.StatisticDisplay;
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
    @Test
    public void checkStatisticDisplay() {

        WeatherData weatherData = new WeatherData();
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(50, 25, 1000);

        String expected = "Poor version - display only temperature 50.0";
        assertEquals(expected, statisticDisplay.display());
    }

    @Test
    public void shouldNotNotifyRemovedObserver() {

        WeatherData weatherData = new WeatherData();
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(50, 25, 1000);
        weatherData.removeObserver(statisticDisplay);

        weatherData.setMeasurements(1000, 1000, 1000);
        String expected = "Poor version - display only temperature 50.0";
        assertEquals(expected, statisticDisplay.display());
    }
}
