package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Quack implements QuackBehavior {
    private static final Logger LOGGER = LoggerFactory.getLogger(Quack.class);

    @Override
    public void quack() {
        LOGGER.info("Quack");
    }
}
