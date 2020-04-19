package com.braindevoiler.designpattern.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Tea extends CaffeineBeverage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tea.class);

    @Override
    public void description() {
        LOGGER.info("\n\nPreparing Tea...\n");
    }

    @Override
    public void brew() {
        LOGGER.info("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        LOGGER.info("Adding Lemon");
    }
}
