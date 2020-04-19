package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItems;
    private int currentIndex = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.length && menuItems[currentIndex] != null;
    }

    @Override
    public MenuItem next() {
        if (currentIndex < menuItems.length) {
            MenuItem menuItem = menuItems[currentIndex];
            currentIndex++;
            return menuItem;
        } else {
            throw new NoSuchElementException("");
        }
    }

    @Override public void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
