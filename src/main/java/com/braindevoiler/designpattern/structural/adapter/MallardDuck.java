package com.braindevoiler.designpattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MallardDuck implements Duck {
    private static final Logger LOGGER = LoggerFactory.getLogger(MallardDuck.class);

    @Override
    public void quack() {
        LOGGER.info("Quack");
    }

    @Override
    public void fly() {
        LOGGER.info("I'm flying");
    }
}
