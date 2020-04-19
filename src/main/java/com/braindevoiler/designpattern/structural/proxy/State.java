package com.braindevoiler.designpattern.structural.proxy;

import java.io.Serializable;


// Serialization is needed to transfer state over network.
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
