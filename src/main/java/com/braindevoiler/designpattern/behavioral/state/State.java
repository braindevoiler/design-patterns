package com.braindevoiler.designpattern.behavioral.state;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
