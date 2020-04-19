package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;


public interface Menu {
    public Iterator<MenuItem> createIterator();
}
