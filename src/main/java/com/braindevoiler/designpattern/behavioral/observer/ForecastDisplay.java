package com.braindevoiler.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ForecastDisplay implements Observer, DisplayElement {
    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastDisplay.class);

    private float temperature;
    private float humidity;
    private float pressure;
    private final Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        LOGGER.info("Future conditions: {}F degrees and {}% humidity and {} bar",
                (temperature + 5), (humidity + 2), (pressure - 1));
    }
}
