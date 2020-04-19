package com.braindevoiler.designpattern.structural.facade;

public class TheaterLights {

    public void on() {
        System.out.println("Switching on theater lights...");
    }

    public void off() {
        System.out.println("Switching off theater lights...");
    }

    public void dim(int level) {
        System.out.println("Settings theater lights to dim level " + level);
    }
}
