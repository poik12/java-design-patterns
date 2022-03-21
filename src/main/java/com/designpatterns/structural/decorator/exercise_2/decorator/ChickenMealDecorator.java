package com.designpatterns.structural.decorator.exercise_2.decorator;

import com.designpatterns.structural.decorator.exercise_2.meal.Meal;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    public void addChicken() {
        System.out.println("Chicken added into meal.");
    }

}
