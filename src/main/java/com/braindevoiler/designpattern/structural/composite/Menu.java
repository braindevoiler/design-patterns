package com.braindevoiler.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Menu extends MenuComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(Menu.class);

    private final List<MenuComponent> menuComponents;
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void print() {
        LOGGER.info(name);
        LOGGER.info(description);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
