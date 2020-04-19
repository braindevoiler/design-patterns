package com.braindevoiler.designpattern.structural.bridge;

public abstract class Tv {
    public void on() {
        System.out.println("Switching on TV...");
    }

    public void off() {
        System.out.println("Switching off TV...");
    }

    public abstract void tuneChannel(int channelNumber);
}
