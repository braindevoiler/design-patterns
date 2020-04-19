package com.braindevoiler.designpattern.creational.abstractFactory;

public class AbstractFactoryTest {
    /*
     * The Abstract Factory Pattern provides an interface for creating families of related or dependent objects
     * without specifying their concrete classes.
     */
    public static void main(String args[]){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
