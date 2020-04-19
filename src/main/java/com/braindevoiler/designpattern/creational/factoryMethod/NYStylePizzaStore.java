package com.braindevoiler.designpattern.creational.factoryMethod;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            case VEGGIE:
                pizza = new NYStylePepperoniPizza();
                break;
            default:
                throw new RuntimeException("Please give correct pizza type!");
        }
        return pizza;
    }
}
