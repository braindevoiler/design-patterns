package com.braindevoiler.designpattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WildTurkey implements Turkey {
    private static final Logger LOGGER = LoggerFactory.getLogger(WildTurkey.class);

    @Override
    public void gobble() {
        LOGGER.info("Gobble gobble");
    }

    @Override
    public void fly() {
        LOGGER.info("I'm flying a short distance");
    }
}
