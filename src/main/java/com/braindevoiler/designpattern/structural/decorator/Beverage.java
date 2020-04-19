package com.braindevoiler.designpattern.structural.decorator;

public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    protected abstract double cost();
}
