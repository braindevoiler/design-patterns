package com.braindevoiler.designpattern.behavioral.iterator;

import java.util.Iterator;


public interface Menu {
    Iterator<MenuItem> createIterator();
}
