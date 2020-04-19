package com.braindevoiler.designpattern.creational.abstractfactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;


public class PepperoniPizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(PepperoniPizza.class);

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Pepperoni";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        LOGGER.info("Preparing Pepperoni Pizza!");
    }
}
