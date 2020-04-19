package com.braindevoiler.designpattern.creational.abstractFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Cheese";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        System.out.println("Preparing Cheese Pizza!");
    }
}
