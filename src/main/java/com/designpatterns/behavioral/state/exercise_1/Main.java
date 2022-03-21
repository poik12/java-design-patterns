package com.designpatterns.behavioral.state.exercise_1;

import com.designpatterns.behavioral.state.exercise_1.state.CoffeeMachine;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();

    }
}
