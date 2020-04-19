package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FlyNoWay implements FlyBehavior {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        LOGGER.info("I can't fly");
    }
}
