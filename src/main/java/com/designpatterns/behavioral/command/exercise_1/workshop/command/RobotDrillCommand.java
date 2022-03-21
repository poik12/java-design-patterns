package com.designpatterns.behavioral.command.exercise_1.workshop.command;

import com.designpatterns.behavioral.command.exercise_1.workshop.Robot;

public class RobotDrillCommand implements Command {

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {

    }

}
