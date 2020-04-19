package com.braindevoiler.designpattern.behavioral.state;

public class StateTest {
    /**
     * The State Pattern allows an object to alter its behavior when its internal state changes. The object will
     * appear to change its class.
     * <p>
     * The pattern encapsulates state into separate classes and delegates to the object representing the current state.
     * <p>
     * The class diagram of State pattern is same as of Strategy pattern.
     */
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
