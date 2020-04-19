package com.braindevoiler.designpattern.creational.factoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style Clam Pizza!");
    }
}
