package com.braindevoiler.designpattern.behavioral.template;

public class Tea extends CaffeineBeverage {
    @Override
    public void description() {
        System.out.println("\n\nPreparing Tea...\n");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
