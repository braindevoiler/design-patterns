package com.braindevoiler.designpattern.creational.builder;

public class Computer {
    private String cpu;
    private String motherBoard;
    private String ram;
    private String hardDisk;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(String cpu, String motherBoard, String ram, String hardDisk,
                     boolean isGraphicsCardEnabled, boolean isBluetoothEnabled){
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public static final class ComputerBuilder {
        private String cpu;
        private String motherBoard;
        private String ram;
        private String hardDisk;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder cpu (String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder motherBoard (String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public ComputerBuilder ram (String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder hardDisk (String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public ComputerBuilder graphicsCardEnabled (boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder bluetoothEnabled (boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this.cpu, this.motherBoard, this.ram, this.hardDisk,
                    this.isGraphicsCardEnabled, this.isBluetoothEnabled);
        }
    }
}
