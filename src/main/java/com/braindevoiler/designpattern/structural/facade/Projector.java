package com.braindevoiler.designpattern.structural.facade;

public class Projector {

    public void on() {
        System.out.println("Switching on projector...");
    }

    public void off() {
        System.out.println("Switching off projector...");
    }

    public void wideScreenMode() {
        System.out.println("Setting wide screen mode on projector...");
    }
}
