package com.braindevoiler.designpattern.creational.factorymethod.pizzastore;

import com.braindevoiler.designpattern.creational.factorymethod.PizzaType;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.Pizza;


public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
