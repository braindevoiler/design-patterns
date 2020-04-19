package com.braindevoiler.designpattern.structural.facade;

public class DvdPlayer {
    private Amplifier amplifier;
    private  Projector projector;

    public DvdPlayer(Amplifier amplifier, Projector projector) {
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void on() {
        System.out.println("Switching on Dvd Player...");
    }

    public void off() {
        System.out.println("Switching off Dvd Player...");
    }

    public void eject() {
        System.out.println("Ejecting Dvd...");
    }

    public void pause() {
        System.out.println("Pausing movie...");
    }

    public void stop() {
        System.out.println("Stopping movie...");
    }

    public void play(String movie) {
        System.out.println("Playing movie " + movie);
    }

    public void setSurroundAudio() {
        amplifier.setSurroundSound();
    }

    public void setTwoChannelAudio() {
        amplifier.setStereoSound();
    }

}
