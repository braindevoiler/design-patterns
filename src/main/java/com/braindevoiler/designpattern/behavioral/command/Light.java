package com.braindevoiler.designpattern.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Light {
    private static final Logger LOGGER = LoggerFactory.getLogger(Light.class);

    public void on() {
        LOGGER.info("Switching on light");
    }

    public void off() {
        LOGGER.info("Switching off light");
    }
}
