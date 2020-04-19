package com.braindevoiler.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;


public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void print() {
        System.out.println(name);
        System.out.println(description + "\n");
        for(MenuComponent menuComponent: menuComponents) {
            menuComponent.print();
        }
    }
}
