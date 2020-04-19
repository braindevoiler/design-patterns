package com.braindevoiler.designpattern.behavioral.template;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        description();
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void description();

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
