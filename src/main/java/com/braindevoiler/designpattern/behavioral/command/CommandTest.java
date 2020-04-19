package com.braindevoiler.designpattern.behavioral.command;

public class CommandTest {
    /*
     * The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with
     * different requests, queue or log requests, and support undoable operations.
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        remote.setCommand(0, lightOn, lightOff);
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
    }
}
