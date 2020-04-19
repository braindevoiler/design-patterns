package com.braindevoiler.designpattern.behavioral.template;

public class TemplateTest {
    /*
     * The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
     * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms's
     * structure.
     */
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
