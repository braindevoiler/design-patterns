package com.braindevoiler.designpattern.creational.factoryMethod;

public class FactoryMethodTest {
    /*
     * The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class
      * to instantiate. Factory method lets a class defer instantiation to subclasses.
     */
    public static void main(String args[]){
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        nyStylePizzaStore.orderPizza(PizzaType.CHEESE);
        chicagoStylePizzaStore.orderPizza(PizzaType.CHEESE);
        nyStylePizzaStore.orderPizza(PizzaType.CLAM);
        chicagoStylePizzaStore.orderPizza(PizzaType.CLAM);
        nyStylePizzaStore.orderPizza(PizzaType.PEPPERONI);
        chicagoStylePizzaStore.orderPizza(PizzaType.PEPPERONI);
        nyStylePizzaStore.orderPizza(PizzaType.VEGGIE);
        chicagoStylePizzaStore.orderPizza(PizzaType.VEGGIE);
    }
}
