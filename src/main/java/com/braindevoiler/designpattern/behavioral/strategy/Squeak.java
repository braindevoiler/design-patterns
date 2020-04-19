package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Squeak implements QuackBehavior {
    private static final Logger LOGGER = LoggerFactory.getLogger(Squeak.class);

    @Override
    public void quack() {
        LOGGER.info("Squeak");
    }
}
