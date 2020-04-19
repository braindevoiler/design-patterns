package com.braindevoiler.designpattern.structural.bridge;

public class ConcreteRemote extends RemoteControl {

    int currentStation;

    public ConcreteRemote(Tv tv, int currentStation) {
        super(tv);
        this.currentStation = currentStation;
    }

    public void nextChannel() {
        currentStation++;
        setChannel(currentStation);
    }

    public void previousChannel() {
        currentStation--;
        setChannel(currentStation);
    }
}
