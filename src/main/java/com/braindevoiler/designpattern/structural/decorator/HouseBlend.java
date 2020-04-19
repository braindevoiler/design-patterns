package com.braindevoiler.designpattern.structural.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    protected double cost() {
        return 25.0;
    }

}
