package com.braindevoiler.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class Tv {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tv.class);

    public void on() {
        LOGGER.info("Switching on TV...");
    }

    public void off() {
        LOGGER.info("Switching off TV...");
    }

    public abstract void tuneChannel(int channelNumber);
}
