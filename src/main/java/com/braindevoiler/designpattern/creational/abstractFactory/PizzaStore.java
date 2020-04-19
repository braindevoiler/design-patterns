package com.braindevoiler.designpattern.creational.abstractFactory;

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
