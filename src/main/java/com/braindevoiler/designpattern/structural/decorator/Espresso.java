package com.braindevoiler.designpattern.structural.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected double cost() {
        return 20.0;
    }

}
