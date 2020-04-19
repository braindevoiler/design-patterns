package com.braindevoiler.designpattern.behavioral.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("ReadheadDuck");
    }
}
