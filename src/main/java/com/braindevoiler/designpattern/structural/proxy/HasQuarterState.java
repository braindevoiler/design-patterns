package com.braindevoiler.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HasQuarterState implements State {
    private static final Logger LOGGER = LoggerFactory.getLogger(HasQuarterState.class);

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        LOGGER.info("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        LOGGER.info("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        LOGGER.info("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        LOGGER.info("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "HasQuarterState";
    }
}
