package com.braindevoiler.designpattern.creational.simpleFactory;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Clam Pizza!");
    }
}
