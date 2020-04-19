package com.braindevoiler.designpattern.creational.factoryMethod;

public abstract class Pizza {
    public abstract void prepare();
    public void bake(){
        System.out.println("Baking Pizza!");
    }
    public void cut(){
        System.out.println("Cutting Pizza!");
    }
    public void box(){
        System.out.println("Boxing Pizza!");
    }
}
