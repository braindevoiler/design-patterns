package com.braindevoiler.designpattern.creational.abstractfactory.pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory.PizzaIngredientFactory;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Cheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Clams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Dough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Pepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Sauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Veggies;


public abstract class Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(Pizza.class);

    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Sauce sauce;
    protected Clams clams;
    protected Pepperoni pepperoni;
    protected Veggies[] veggies;

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public abstract void prepare();

    public void bake() {
        LOGGER.info("Baking {} Pizza!", name);
    }

    public void cut() {
        LOGGER.info("Cutting {} Pizza!", name);
    }

    public void box() {
        LOGGER.info("Boxing {} Pizza!", name);
    }
}
