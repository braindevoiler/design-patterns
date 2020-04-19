package com.braindevoiler.designpattern.creational.factorymethod.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ChicagoStylePepperoniPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChicagoStylePepperoniPizza.class);

    @Override
    public void prepare() {
        LOGGER.info("Preparing Chicago style Pepperoni Pizza!");
    }
}
