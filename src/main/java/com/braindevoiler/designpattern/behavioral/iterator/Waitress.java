package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;


public class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printBreakfastMenu() {
        Iterator<MenuItem> breakfastItemsIterator = pancakeHouseMenu.createIterator();
        System.out.println("\n\nPrinting Breakfast Menu:\n");
        printMenu(breakfastItemsIterator);
    }

    public void printLunchMenu() {
        Iterator<MenuItem> lunchItemsIterator = dinerMenu.createIterator();
        System.out.println("\n\nPrinting Lunch Menu:\n");
        printMenu(lunchItemsIterator);
    }

}
