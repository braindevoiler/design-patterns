package com.braindevoiler.designpattern.creational.abstractfactory.pizzastore;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.PizzaType;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.Pizza;


public abstract class PizzaStore {

    protected PizzaIngredientFactory pizzaIngredientFactory;

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
