package com.braindevoiler.designpattern.creational.abstractFactory;

public class ClamPizza extends Pizza {
    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Clam";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
        System.out.println("Preparing Clam Pizza!");
    }
}
