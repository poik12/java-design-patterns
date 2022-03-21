package com.designpatterns.behavioral.command.exercise_1.workshop.command;

import com.designpatterns.behavioral.command.exercise_1.workshop.Robot;

public class RobotCutCommand implements Command {

    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }


}
