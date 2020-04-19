package com.braindevoiler.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SonyTv extends Tv {
    private static final Logger LOGGER = LoggerFactory.getLogger(SonyTv.class);

    public void tuneChannel(int channelNumber) {
        LOGGER.info("Tuning to channel number {} on Sony TV...", channelNumber);
    }
}
