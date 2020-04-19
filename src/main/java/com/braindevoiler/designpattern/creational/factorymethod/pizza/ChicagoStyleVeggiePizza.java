package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ChicagoStyleVeggiePizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChicagoStyleVeggiePizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing Chicago style Veggie Pizza!");
    }
}
