package com.braindevoiler.designpattern.structural.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    protected double cost() {
        return 10.0;
    }
}
