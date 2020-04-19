package com.braindevoiler.designpattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AdapterTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterTest.class);

    /**
     * The Adapter Pattern converts the interface of a class into another interface the clients expect.
     * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
     * <p>
     * Object composition is used to wrap the adaptee(Turkey) with an altered interface(Duck);
     * The advantage of this approach is that we can use an adapter with any subclass of the adaptee.
     */
    public static void main(String args[]) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());

        LOGGER.info("Duck says:");
        duck.quack();
        duck.fly();

        LOGGER.info("\nTurkey says:");
        turkey.gobble();
        turkey.fly();

        LOGGER.info("\nTurkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
