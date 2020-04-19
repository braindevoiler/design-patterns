package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Amplifier {
    private static final Logger LOGGER = LoggerFactory.getLogger(Amplifier.class);

    public void on() {
        LOGGER.info("Amplifier on");
    }

    public void off() {
        LOGGER.info("Amplifier off");
    }

    public void setStereoSound() {
        LOGGER.info("Setting amplifier sound to stereo sound");
    }

    public void setSurroundSound() {
        LOGGER.info("Setting amplifier sound to surround sound");
    }

    public void setVolume(int volume) {
        LOGGER.info("Setting volume to {}", volume);
    }

}
