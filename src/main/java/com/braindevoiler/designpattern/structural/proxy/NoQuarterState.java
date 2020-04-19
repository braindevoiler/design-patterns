package com.braindevoiler.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NoQuarterState implements State {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoQuarterState.class);

    // @transient will make sure that this field won't be serialized.
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        LOGGER.info("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        LOGGER.info("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        LOGGER.info("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        LOGGER.info("You need to pay first");
    }

    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
