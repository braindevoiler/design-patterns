package com.braindevoiler.designpattern.creational.simplefactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ClamPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClamPizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing Clam Pizza!");
    }
}
