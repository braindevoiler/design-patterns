package com.braindevoiler.designpattern.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SingletonTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonTest.class);

    /*
     * The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
     */
    public static void main(String args[]) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        LOGGER.info("Singleton1: {}", singleton1);
        LOGGER.info("Singleton2: {}", singleton2);
    }
}
