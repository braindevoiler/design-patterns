package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FlyWithWings implements FlyBehavior {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyWithWings.class);

    @Override
    public void fly() {
        LOGGER.info("I'm flying!");
    }
}
