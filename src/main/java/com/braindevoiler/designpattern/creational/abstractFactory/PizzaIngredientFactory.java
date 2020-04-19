package com.braindevoiler.designpattern.creational.abstractFactory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
}
