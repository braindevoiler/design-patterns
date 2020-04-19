package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NYStyleCheesePizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(NYStyleCheesePizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing NY style Cheese Pizza!");
    }
}
