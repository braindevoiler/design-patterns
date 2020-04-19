package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MallardDuck extends Duck {
    private static final Logger LOGGER = LoggerFactory.getLogger(MallardDuck.class);

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        LOGGER.info("Mallard Duck");
    }
}
