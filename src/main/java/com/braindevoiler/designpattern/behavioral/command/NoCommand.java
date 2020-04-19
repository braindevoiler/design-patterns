package com.braindevoiler.designpattern.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NoCommand implements Command {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoCommand.class);

    @Override
    public void execute() {
        LOGGER.info("Do Nothing");
    }

    @Override
    public void undo() {
        LOGGER.info("Undo Nothing");
    }
}
