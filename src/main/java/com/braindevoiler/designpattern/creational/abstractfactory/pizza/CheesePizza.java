package com.braindevoiler.designpattern.creational.abstractfactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;


public class CheesePizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheesePizza.class);

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Cheese";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        LOGGER.info("Preparing Cheese Pizza!");
    }
}
