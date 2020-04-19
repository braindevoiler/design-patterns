package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NYStyleClamPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(NYStyleClamPizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing NY style Clam Pizza!");
    }
}
