package com.braindevoiler.designpattern.behavioral.strategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quake() {
        quackBehavior.quack();
    };

    public void swim() {
        System.out.println("Swimming...");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
