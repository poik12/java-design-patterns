package com.designpatterns.structural.decorator.exercise_2.decorator;

import com.designpatterns.structural.decorator.exercise_2.meal.Meal;

public abstract class MealDecorator extends Meal {

    protected Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
