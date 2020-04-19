package com.braindevoiler.designpattern.creational.abstractfactory.pizzastore;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.NYPizzaIngredientFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.PepperoniPizza;
import com.braindevoiler.designpattern.creational.abstractfactory.PizzaType;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.CheesePizza;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.ClamPizza;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.Pizza;
import com.braindevoiler.designpattern.creational.abstractfactory.pizza.VeggiePizza;


public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
        pizzaIngredientFactory = new NYPizzaIngredientFactory();
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
