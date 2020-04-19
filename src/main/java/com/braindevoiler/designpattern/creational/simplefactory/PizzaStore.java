package com.braindevoiler.designpattern.creational.simplefactory;

import com.braindevoiler.designpattern.creational.simplefactory.pizza.Pizza;


public class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
