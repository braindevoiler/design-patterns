package com.braindevoiler.designpattern.structural.decorator;

public class DecoratorTest {
    /*
     * The Decorator Pattern attaches additional responsibilities to an object dynamically.
     * Decorator provides a flexible alternative to subclassing for extending functionality.
     *
     * * Decorators have the same supertype as the objects they decorate.
     *
     * * You can use one or more decorators to wrap an object.
     *
     * * Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated
     * object in place of the original(wrapped) object.
     *
     * * The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the
     * rest of the job.
     *
     * * Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many
     * decorators as we like.
     *
     * java.io package is largely based on Decorator.
     *
     */
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " " + beverage3.cost());
    }
}
