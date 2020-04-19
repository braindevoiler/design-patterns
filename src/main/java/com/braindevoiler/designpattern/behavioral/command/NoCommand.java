package com.braindevoiler.designpattern.behavioral.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Do Nothing");
    }

    @Override
    public void undo() {
        System.out.println("Undo Nothing");
    }
}
