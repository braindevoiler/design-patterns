package com.braindevoiler.designpattern.behavioral.observer;

public class ObserverTest {
    /**
     * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
     * all of its dependents are notified and updated automatically.
     * <p>
     * The Observer Pattern provides an object design where subjects ond observers are loosely coupled.
     * <p>
     * Java provides the Observer interface and the Observable class in the java.util package.
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
