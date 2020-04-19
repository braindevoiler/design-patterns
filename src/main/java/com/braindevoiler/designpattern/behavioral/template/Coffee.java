package com.braindevoiler.designpattern.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Coffee extends CaffeineBeverage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Coffee.class);

    @Override
    public void description() {
        LOGGER.info("\n\nPreparing Coffee...\n");
    }

    @Override
    public void brew() {
        LOGGER.info("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        LOGGER.info("Adding Sugar and Milk");
    }
}
