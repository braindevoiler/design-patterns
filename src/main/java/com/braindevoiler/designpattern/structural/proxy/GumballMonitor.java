package com.braindevoiler.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GumballMonitor {
    private static final Logger LOGGER = LoggerFactory.getLogger(GumballMonitor.class);

    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            LOGGER.info("Gumball Machine: {}", machine.getLocation());
            LOGGER.info("Current inventory: {} gumballs", machine.getCount());
            LOGGER.info("Current state: {}", machine.getState());
        } catch (Exception e) {
            LOGGER.error("Error:", e);
        }
    }
}
