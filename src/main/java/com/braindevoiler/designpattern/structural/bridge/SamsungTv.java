package com.braindevoiler.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SamsungTv extends Tv {
    private static final Logger LOGGER = LoggerFactory.getLogger(SamsungTv.class);

    public void tuneChannel(int channelNumber) {
        LOGGER.info("Tuning to channel number {} on Samsung TV...", channelNumber);
    }
}
