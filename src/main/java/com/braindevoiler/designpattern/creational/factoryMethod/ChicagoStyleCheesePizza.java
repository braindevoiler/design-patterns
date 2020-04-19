package com.braindevoiler.designpattern.creational.factoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style Cheese Pizza!");
    }
}
