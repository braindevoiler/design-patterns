package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Screen {
    private static final Logger LOGGER = LoggerFactory.getLogger(Screen.class);

    public void up() {
        LOGGER.info("Setting screen up...");
    }

    public void down() {
        LOGGER.info("Setting screen down...");
    }
}
