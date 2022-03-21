package com.designpatterns.structural.decorator.exercise_2.meal;

public class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("I'm preparing meal based on rice.");
    }
}
