package com.braindevoiler.designpattern.creational.simpleFactory;

public class SimplePizzaFactory {
    public static Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default:
                throw new RuntimeException("Please give correct pizza type!");
        }
        return pizza;
    }
}
