package com.designpatterns.behavioral.state.exercise_2;

public class Main {

    public static void main(String[] args) {

        GameMachine gameMachine = new GameMachine();

        gameMachine.insertTheCoin();
        gameMachine.pullTheLever();
        gameMachine.takeWinnings();

    }

}
