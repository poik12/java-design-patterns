package com.designpatterns.behavioral.command.exercise_1;

import com.designpatterns.behavioral.command.exercise_1.workshop.CoffeeMaker;
import com.designpatterns.behavioral.command.exercise_1.workshop.Robot;
import com.designpatterns.behavioral.command.exercise_1.workshop.WorkshopApp;
import com.designpatterns.behavioral.command.exercise_1.workshop.command.*;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
/*        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
        workshopApp.run();

        workshopApp.run();

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        workshopApp.addToQueue(new CoffeeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));
        workshopApp.run();*/

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();

    }
}
