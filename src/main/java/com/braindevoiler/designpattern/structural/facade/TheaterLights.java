package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TheaterLights {
    private static final Logger LOGGER = LoggerFactory.getLogger(TheaterLights.class);

    public void on() {
        LOGGER.info("Switching on theater lights...");
    }

    public void off() {
        LOGGER.info("Switching off theater lights...");
    }

    public void dim(int level) {
        LOGGER.info("Settings theater lights to dim level {}", level);
    }
}
