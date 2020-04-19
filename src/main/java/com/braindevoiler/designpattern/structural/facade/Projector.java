package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Projector {
    private static final Logger LOGGER = LoggerFactory.getLogger(Projector.class);

    public void on() {
        LOGGER.info("Switching on projector...");
    }

    public void off() {
        LOGGER.info("Switching off projector...");
    }

    public void wideScreenMode() {
        LOGGER.info("Setting wide screen mode on projector...");
    }
}
