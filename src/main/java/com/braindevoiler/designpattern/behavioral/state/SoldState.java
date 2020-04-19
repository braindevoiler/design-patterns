package com.braindevoiler.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SoldState implements State {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoldState.class);

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        LOGGER.info("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        LOGGER.info("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        LOGGER.info("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            LOGGER.info("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

}
