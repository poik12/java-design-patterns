package com.designpatterns.behavioral.state.exercise_2.state;

import com.designpatterns.behavioral.state.exercise_2.GameMachine;

public class NoCoinMachineState implements MachineState {
    @Override
    public void insertTheCoin(GameMachine gameMachine) {
        System.out.println("Coin inserted");
        gameMachine.setMachineState(new CoinInsertedMachineState());
    }

    @Override
    public void pullTheLever(GameMachine gameMachine) {
        System.out.println("First insert the coin");
    }

    @Override
    public void takeWinnings(GameMachine gameMachine) {
        System.out.println("Insert the coin and pull the lever");
    }
}
