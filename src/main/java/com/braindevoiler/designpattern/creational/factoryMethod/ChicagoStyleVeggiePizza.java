package com.braindevoiler.designpattern.creational.factoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style Veggie Pizza!");
    }
}
