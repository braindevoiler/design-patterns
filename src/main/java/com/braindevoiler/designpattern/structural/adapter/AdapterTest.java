package com.braindevoiler.designpattern.structural.adapter;

public class AdapterTest {
    /*
     * The Adapter Pattern converts the interface of a class into another interface the clients expect.
     * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
     *
     * Object composition is used to wrap the adaptee(Turkey) with an altered interface(Duck);
     * The advantage of this approach is that we can use an adapter with any subclass of the adaptee.
     */
    public static void main(String args[]) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());

        System.out.println("Duck says:");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkey says:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nTurkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
