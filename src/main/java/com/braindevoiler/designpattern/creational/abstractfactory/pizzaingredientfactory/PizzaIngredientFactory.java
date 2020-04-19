package com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Cheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Clams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Dough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Pepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Sauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Veggies;


public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clams createClams();

    Pepperoni createPepperoni();

    Veggies[] createVeggies();
}
