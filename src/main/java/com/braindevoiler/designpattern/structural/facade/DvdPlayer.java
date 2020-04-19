package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DvdPlayer {
    private static final Logger LOGGER = LoggerFactory.getLogger(DvdPlayer.class);

    private final Amplifier amplifier;
    private final Projector projector;

    public DvdPlayer(Amplifier amplifier, Projector projector) {
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void on() {
        LOGGER.info("Switching on Dvd Player...");
    }

    public void off() {
        LOGGER.info("Switching off Dvd Player...");
    }

    public void eject() {
        LOGGER.info("Ejecting Dvd...");
    }

    public void pause() {
        LOGGER.info("Pausing movie...");
    }

    public void stop() {
        LOGGER.info("Stopping movie...");
    }

    public void play(String movie) {
        LOGGER.info("Playing movie {}", movie);
    }

    public void setSurroundAudio() {
        amplifier.setSurroundSound();
    }

    public void setTwoChannelAudio() {
        amplifier.setStereoSound();
    }

}
