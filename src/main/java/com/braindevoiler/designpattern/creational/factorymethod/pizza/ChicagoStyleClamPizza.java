package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ChicagoStyleClamPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChicagoStyleClamPizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing Chicago style Clam Pizza!");
    }
}
