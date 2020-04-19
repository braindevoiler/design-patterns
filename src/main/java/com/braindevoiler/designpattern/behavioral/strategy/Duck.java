package com.braindevoiler.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class Duck {
    private static final Logger LOGGER = LoggerFactory.getLogger(Duck.class);

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quake() {
        quackBehavior.quack();
    }

    public void swim() {
        LOGGER.info("Swimming...");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
