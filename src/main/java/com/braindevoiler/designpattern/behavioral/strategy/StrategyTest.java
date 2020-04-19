package com.braindevoiler.designpattern.behavioral.strategy;

public class StrategyTest {
    /*
     * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
     * Strategy lets the algorithm vary independently from clients that use it.
     */
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quake();
        mallard.swim();
        mallard.fly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quake();
        redheadDuck.swim();
        redheadDuck.fly();
        redheadDuck.setFlyBehavior(new FlyWithWings());
        redheadDuck.setQuackBehavior(new Quack());
        redheadDuck.swim();
        redheadDuck.fly();
    }
}
