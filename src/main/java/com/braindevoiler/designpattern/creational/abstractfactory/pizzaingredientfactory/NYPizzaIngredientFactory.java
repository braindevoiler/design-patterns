package com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredientfactory;

import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Cheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Clams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Dough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.FreshClams;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.MarinaraSauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.MozzarellaCheese;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Pepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Sauce;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.SlicedPepperoni;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.ThickCrustDough;
import com.braindevoiler.designpattern.creational.abstractfactory.pizzaingredient.Veggies;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
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
