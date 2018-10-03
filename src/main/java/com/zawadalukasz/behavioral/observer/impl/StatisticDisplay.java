package com.zawadalukasz.behavioral.observer.impl;

import com.zawadalukasz.behavioral.observer.abstraction.DisplayElement;
import com.zawadalukasz.behavioral.observer.abstraction.Observer;

public class StatisticDisplay implements Observer, DisplayElement {

    private float temperature;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        display();
    }

    public String display() {
        return "Poor version - display only temperature " + temperature;
    }
}
