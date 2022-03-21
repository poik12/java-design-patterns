package com.designpatterns.behavioral.command.exercise_1.workshop;

import com.designpatterns.behavioral.command.exercise_1.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    private List<Command> commandQueue = new ArrayList<>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Command Queue does not contain any commands");
        }

        for (Command command : commandQueue) {
            command.execute();
        }

//        commandQueue.clear();
    }

    public void undoLastCommand() {
        for (Command command : commandQueue) {
            command.undo();
        }
    }
}
