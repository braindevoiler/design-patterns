package com.braindevoiler.designpattern.creational.abstractfactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;


public class ClamPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClamPizza.class);

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Clam";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
        LOGGER.info("Preparing Clam Pizza!");
    }
}
