package com.braindevoiler.designpattern.creational.simpleFactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza!");
    }
}
