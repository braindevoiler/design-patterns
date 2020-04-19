package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ChicagoStyleCheesePizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChicagoStyleCheesePizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing Chicago style Cheese Pizza!");
    }
}
