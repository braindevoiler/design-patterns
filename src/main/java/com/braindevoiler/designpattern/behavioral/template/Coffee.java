package com.braindevoiler.designpattern.behavioral.template;

public class Coffee extends CaffeineBeverage{
    @Override
    public void description() {
        System.out.println("\n\nPreparing Coffee...\n");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
