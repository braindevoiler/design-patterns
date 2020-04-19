package com.braindevoiler.designpattern.creational.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                break;
            default:
                throw new RuntimeException("Please give correct pizza type!");
        }
        return pizza;
    }
}
