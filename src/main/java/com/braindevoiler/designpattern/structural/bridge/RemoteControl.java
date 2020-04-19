package com.braindevoiler.designpattern.structural.bridge;

public class RemoteControl {
    private Tv tv;

    public RemoteControl(Tv tv) {
        this.tv = tv;
    }

    public void on() {
        tv.on();
    }

    public void off() {
        tv.off();
    }

    public void setChannel(int channelNumber) {
        tv.tuneChannel(channelNumber);
    }
}
