package com.braindevoiler.designpattern.creational.factoryMethod;

public class NYStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY style Veggie Pizza!");
    }
}
