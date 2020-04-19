package com.braindevoiler.designpattern.structural.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    protected double cost() {
        return 3.0 + beverage.cost();
    }

}
