package com.braindevoiler.designpattern.creational.simpleFactory;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza!");
    }
}
