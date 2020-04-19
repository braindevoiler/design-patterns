package com.braindevoiler.designpattern.behavioral.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
