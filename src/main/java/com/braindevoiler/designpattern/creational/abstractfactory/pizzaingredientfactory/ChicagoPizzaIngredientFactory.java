package com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Cheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Clams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Dough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.FrozenClams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Pepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.PlumTomatoSauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.ReggianoCheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Sauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.SlicedPepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.ThinCrustDough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Veggies;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        return null;
    }
}
