package com.zawadalukasz.behavioral.observer.impl;

import com.zawadalukasz.behavioral.observer.abstraction.Observer;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public String display() {
        return "Current conditions: " + temperature + "F degrees and " + humidity + " % humidity";
    }
}
