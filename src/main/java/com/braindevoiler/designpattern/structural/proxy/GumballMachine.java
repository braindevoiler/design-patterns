package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.structural.proxy.machinestate.HasQuarterState;
import com.braindevoiler.designpattern.structural.proxy.machinestate.NoQuarterState;
import com.braindevoiler.designpattern.structural.proxy.machinestate.SoldOutState;
import com.braindevoiler.designpattern.structural.proxy.machinestate.SoldState;
import com.braindevoiler.designpattern.structural.proxy.machinestate.State;
import lombok.Getter;


@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemoteProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(GumballMachine.class);

    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;

    private State state;
    private int count;
    private final String location;

    public GumballMachine(int numberOfGumballs, String location) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
        this.location = location;
    }

    @Override
    public void insertQuarter() {
        state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        LOGGER.info("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    @Override
    public void report() {
        LOGGER.info("Gumball Machine: {}", this.getLocation());
        LOGGER.info("Current inventory: {} gumballs", this.getCount());
        LOGGER.info("Current state: {}", this.getState());
    }

}
