package com.braindevoiler.designpattern.creational.factorymethod.pizzastore;

import com.braindevoiler.designpattern.creational.factorymethod.PizzaType;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.ChicagoStyleCheesePizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.ChicagoStyleClamPizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.ChicagoStylePepperoniPizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.ChicagoStyleVeggiePizza;
import com.braindevoiler.designpattern.creational.factorymethod.pizza.Pizza;


public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                throw new RuntimeException("Please give correct pizza type!");
        }
        return pizza;
    }
}
