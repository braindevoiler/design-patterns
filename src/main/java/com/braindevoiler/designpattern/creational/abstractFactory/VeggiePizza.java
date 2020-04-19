package com.braindevoiler.designpattern.creational.abstractFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Veggie";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println("Preparing Veggie Pizza!");
    }
}
