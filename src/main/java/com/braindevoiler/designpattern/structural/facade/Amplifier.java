package com.braindevoiler.designpattern.structural.facade;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setStereoSound() {
        System.out.println("Setting amplifier sound to stereo sound");
    }

    public void setSurroundSound() {
        System.out.println("Setting amplifier sound to surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

}
