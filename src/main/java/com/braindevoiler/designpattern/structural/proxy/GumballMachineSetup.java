package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GumballMachineSetup {
    private static final Logger LOGGER = LoggerFactory.getLogger(GumballMachineSetup.class);

    public static void main(String[] args) {
        int count = 10;
        String location = "127.0.0.1";
        int port = 9099;
        try {
            GumballMachine machine = new GumballMachine(count, location);
            LocateRegistry.createRegistry(port);
            Naming.rebind("//" + location + ":" + port + "/gumballmachine", machine);
            machine.report();
        } catch (Exception e) {
            LOGGER.error("Error:", e);
        }
    }
}
