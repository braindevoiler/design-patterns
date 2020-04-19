package com.braindevoiler.designpattern.creational.abstractFactory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Pepperoni";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        System.out.println("Preparing Pepperoni Pizza!");
    }
}
