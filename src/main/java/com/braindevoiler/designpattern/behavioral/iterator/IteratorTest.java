package com.braindevoiler.designpattern.behavioral.iterator;

public class IteratorTest {
    /*
     * The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without
     * exposing its underlying representations.
     *
     * Iterator Pattern takes the responsibility of traversing elements and gives that responsibility to the iterator
     * object, not the aggregate object.
     */
    public static void main(String args[]) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printBreakfastMenu();
        waitress.printLunchMenu();
    }
}
