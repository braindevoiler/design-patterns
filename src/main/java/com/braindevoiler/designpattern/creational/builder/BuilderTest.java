package com.braindevoiler.designpattern.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BuilderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderTest.class);

    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .cpu("Intel Quad Core")
                .motherBoard("Intel Mother Board")
                .ram("16 GB RAM")
                .hardDisk("1 TB HDD")
                .graphicsCardEnabled(true)
                .bluetoothEnabled(true)
                .build();

        LOGGER.info("CPU: {}", computer.getCpu());
        LOGGER.info("MotherBoard: {}", computer.getMotherBoard());
        LOGGER.info("RAM: {}", computer.getRam());
        LOGGER.info("Hard Disk: {}", computer.getHardDisk());
        LOGGER.info("Is Graphics Card Enabled? {}", computer.isGraphicsCardEnabled());
        LOGGER.info("Is Bluetooth Enabled? {}", computer.isBluetoothEnabled());
    }

}
