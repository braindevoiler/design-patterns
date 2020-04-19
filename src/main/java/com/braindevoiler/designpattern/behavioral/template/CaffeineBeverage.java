package com.braindevoiler.designpattern.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class CaffeineBeverage {
    private static final Logger LOGGER = LoggerFactory.getLogger(CaffeineBeverage.class);

    public void prepareRecipe() {
        description();
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void description();

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        LOGGER.info("Boiling water");
    }

    public void pourInCup() {
        LOGGER.info("Pouring into cup");
    }
}
