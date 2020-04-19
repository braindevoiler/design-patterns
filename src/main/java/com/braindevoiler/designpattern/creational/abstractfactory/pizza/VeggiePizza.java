package com.braindevoiler.designpattern.creational.abstractfactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;


public class VeggiePizza extends Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(VeggiePizza.class);

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Veggie";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        LOGGER.info("Preparing Veggie Pizza!");
    }
}
