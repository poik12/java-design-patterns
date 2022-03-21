package com.designpatterns.structural.decorator.exercise_2.decorator;

import com.designpatterns.structural.decorator.exercise_2.meal.Meal;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    public void addShrimp() {
        System.out.println("Shrimp added into meal.");
    }
}
