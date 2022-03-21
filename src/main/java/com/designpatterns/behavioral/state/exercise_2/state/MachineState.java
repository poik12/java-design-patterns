package com.designpatterns.behavioral.state.exercise_2.state;

import com.designpatterns.behavioral.state.exercise_2.GameMachine;

public interface MachineState {

    void insertTheCoin(GameMachine gameMachine);

    void pullTheLever(GameMachine gameMachine);

    void takeWinnings(GameMachine gameMachine);

}
