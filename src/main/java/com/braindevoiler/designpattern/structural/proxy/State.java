package com.braindevoiler.designpattern.structural.proxy;

import java.io.Serializable;


// Serialization is needed to transfer state over network.
public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
