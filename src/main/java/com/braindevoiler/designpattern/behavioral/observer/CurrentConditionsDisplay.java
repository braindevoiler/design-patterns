package com.braindevoiler.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        LOGGER.info("Current conditions: {} F degrees and {}% humidity", temperature, humidity);
    }
}
