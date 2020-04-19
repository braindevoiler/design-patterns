package com.braindevoiler.designpattern.structural.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    protected double cost() {
        return 8.0 + beverage.cost();
    }

}
