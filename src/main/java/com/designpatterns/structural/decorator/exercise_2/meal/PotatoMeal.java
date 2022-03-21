package com.designpatterns.structural.decorator.exercise_2.meal;

public class PotatoMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("I'm preparing meal based on potatoes.");
    }
}
