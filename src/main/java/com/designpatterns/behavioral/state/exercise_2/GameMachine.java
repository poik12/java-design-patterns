package com.designpatterns.behavioral.state.exercise_2;

import com.designpatterns.behavioral.state.exercise_2.state.MachineState;
import com.designpatterns.behavioral.state.exercise_2.state.NoCoinMachineState;

public class GameMachine {

    private MachineState machineState;

    public GameMachine() {
        this.machineState = new NoCoinMachineState();
    }

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

    public void insertTheCoin() {
        machineState.insertTheCoin(this);
    }

    public void pullTheLever() {
        machineState.pullTheLever(this);
    }

    public void takeWinnings() {
        machineState.takeWinnings(this);
    }

}
