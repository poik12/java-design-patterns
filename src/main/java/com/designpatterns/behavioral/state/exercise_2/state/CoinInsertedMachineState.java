package com.designpatterns.behavioral.state.exercise_2.state;

import com.designpatterns.behavioral.state.exercise_2.GameMachine;

import java.util.Random;

public class CoinInsertedMachineState implements MachineState {
    @Override
    public void insertTheCoin(GameMachine gameMachine) {
        System.out.println("Coin has been already inserted in. Pull the lever!");
    }

    @Override
    public void pullTheLever(GameMachine gameMachine) {
        Random random = new Random();
        int i = random.nextInt(1, 5);
        if (i == 1) {
            System.out.println("Lever pulled.");
            gameMachine.setMachineState(new WinnerMachineState());
        } else {
            System.out.println("You have lost. Try again.");
            gameMachine.setMachineState(new NoCoinMachineState());
        }

    }

    @Override
    public void takeWinnings(GameMachine gameMachine) {
        System.out.println("Pull the lever!");
    }
}
