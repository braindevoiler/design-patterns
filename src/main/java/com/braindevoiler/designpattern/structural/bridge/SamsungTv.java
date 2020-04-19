package com.braindevoiler.designpattern.structural.bridge;

public class SamsungTv extends Tv {

    public void tuneChannel(int channelNumber) {
        System.out.println("Tuning to channel number " + channelNumber + " on Samsung TV...");
    }
}
