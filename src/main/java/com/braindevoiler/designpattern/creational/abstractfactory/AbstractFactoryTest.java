package com.braindevoiler.designpattern.creational.abstractfactory;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzastore.NYPizzaStore;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzastore.PizzaStore;


public class AbstractFactoryTest {
    /**
     * The Abstract Factory Pattern provides an interface for creating families of related or dependent objects
     * without specifying their concrete classes.
     */
    public static void main(String args[]) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
