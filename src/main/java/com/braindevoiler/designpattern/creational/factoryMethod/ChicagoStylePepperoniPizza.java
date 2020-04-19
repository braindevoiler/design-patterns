package com.braindevoiler.designpattern.creational.factoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style Pepperoni Pizza!");
    }
}
