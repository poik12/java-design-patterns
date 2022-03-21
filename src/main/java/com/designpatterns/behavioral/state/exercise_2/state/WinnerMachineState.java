package com.designpatterns.behavioral.state.exercise_2.state;

import com.designpatterns.behavioral.state.exercise_2.GameMachine;

public class WinnerMachineState implements MachineState {
    @Override
    public void insertTheCoin(GameMachine gameMachine) {
        System.out.println("Take the winning.");
    }

    @Override
    public void pullTheLever(GameMachine gameMachine) {
        System.out.println("Take the winning.");
    }

    @Override
    public void takeWinnings(GameMachine gameMachine) {
        System.out.println("Congratulations. You have won.");
        gameMachine.setMachineState(new NoCoinMachineState());
    }
}
