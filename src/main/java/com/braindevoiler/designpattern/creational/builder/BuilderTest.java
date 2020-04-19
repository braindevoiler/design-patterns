package com.braindevoiler.designpattern.creational.builder;

public class BuilderTest {
    Computer computer = Computer.builder()
            .cpu("Intel Quad Core")
            .motherBoard("Intel Mother Board")
            .ram("16 GB RAM")
            .hardDisk("1 TB HDD")
            .graphicsCardEnabled(true)
            .bluetoothEnabled(true)
            .build();
}
