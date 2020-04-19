package com.braindevoiler.designpattern.creational.abstractFactory;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Sauce sauce;
    protected Clams clams;
    protected Pepperoni pepperoni;
    protected Veggies veggies[];

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public abstract void prepare();
    public void bake(){
        System.out.println("Baking " + name + " Pizza!");
    }
    public void cut(){
        System.out.println("Cutting " + name + " Pizza!");
    }
    public void box(){
        System.out.println("Boxing " + name + " Pizza!");
    }
}
