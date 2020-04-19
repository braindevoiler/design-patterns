package com.braindevoiler.designpattern.behavioral.command;

public class SimpleRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private final static int COUNT_COMMANDS = 1;
    public SimpleRemoteControl() {
        onCommands = new Command[COUNT_COMMANDS];
        offCommands = new Command[COUNT_COMMANDS];
        Command noCommand = new NoCommand();
        for(int i=0; i<COUNT_COMMANDS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
