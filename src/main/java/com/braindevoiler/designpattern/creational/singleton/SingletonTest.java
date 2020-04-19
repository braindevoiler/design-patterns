package com.braindevoiler.designpattern.creational.singleton;

public class SingletonTest {
    /*
     * The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
     */
    public static void main(String args[]){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton1: " + singleton1);
        System.out.println("Singleton2: " + singleton2);
    }
}
