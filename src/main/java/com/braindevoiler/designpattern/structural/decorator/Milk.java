package com.braindevoiler.designpattern.structural.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    protected double cost() {
        return 5.0 + beverage.cost();
    }

}
