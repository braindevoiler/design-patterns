package com.braindevoiler.designpattern.structural.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    protected double cost() {
        return 15.0;
    }
}
