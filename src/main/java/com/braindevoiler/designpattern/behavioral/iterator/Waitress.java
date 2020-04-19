package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Waitress {
    private static final Logger LOGGER = LoggerFactory.getLogger(Waitress.class);

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            LOGGER.info(iterator.next().toString());
        }
    }

    public void printBreakfastMenu() {
        Iterator<MenuItem> breakfastItemsIterator = pancakeHouseMenu.createIterator();
        LOGGER.info("\n\nPrinting Breakfast Menu:\n");
        printMenu(breakfastItemsIterator);
    }

    public void printLunchMenu() {
        Iterator<MenuItem> lunchItemsIterator = dinerMenu.createIterator();
        LOGGER.info("\n\nPrinting Lunch Menu:\n");
        printMenu(lunchItemsIterator);
    }

}
