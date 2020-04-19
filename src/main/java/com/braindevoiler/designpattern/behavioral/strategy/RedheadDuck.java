package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RedheadDuck extends Duck {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedheadDuck.class);

    public RedheadDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        LOGGER.info("ReadheadDuck");
    }
}
