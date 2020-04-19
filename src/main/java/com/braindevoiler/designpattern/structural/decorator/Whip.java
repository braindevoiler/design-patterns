package com.braindevoiler.designpattern.structural.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    protected double cost() {
        return 10.0 + beverage.cost();
    }

}
