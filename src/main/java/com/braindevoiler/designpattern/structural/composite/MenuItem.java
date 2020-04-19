package com.braindevoiler.designpattern.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MenuItem extends MenuComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(MenuItem.class);

    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name,
            String description,
            boolean vegetarian,
            double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void print() {
        LOGGER.info("\n\nMenuItem Description: {}, {}, {}, {}\n", name, description, price, vegetarian);
    }
}
