package com.braindevoiler.designpattern.creational.factorymethod.pizzastore;

import com.braindevoiler.designpattern.creational.factorymethod.PizzaType;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.NYStyleCheesePizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.NYStyleClamPizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.NYStylePepperoniPizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.Pizza;


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
