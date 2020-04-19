package com.braindevoiler.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SoldOutState implements State {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoldOutState.class);

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        LOGGER.info("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        LOGGER.info("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        LOGGER.info("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        LOGGER.info("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }

}
