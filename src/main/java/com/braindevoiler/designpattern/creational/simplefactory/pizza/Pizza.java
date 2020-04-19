package com.braindevoiler.designpattern.creational.simplefactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(Pizza.class);

    public abstract void prepare();

    public void bake() {
        LOGGER.info("Baking Pizza!");
    }

    public void cut() {
        LOGGER.info("Cutting Pizza!");
    }

    public void box() {
        LOGGER.info("Boxing Pizza!");
    }
}
