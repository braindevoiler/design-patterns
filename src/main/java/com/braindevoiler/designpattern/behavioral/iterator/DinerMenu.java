package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DinerMenu implements Menu {
    private static final Logger LOGGER = LoggerFactory.getLogger(DinerMenu.class);

    private static final int MAX_ITEMS = 6;
    private final MenuItem[] menuItems;
    private int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on false wheat",
                true, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hotdog",
                "A hot dog, with a side of potato salad",
                false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            LOGGER.info("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
