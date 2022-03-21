package com.designpatterns.structural.decorator.exercise_2.decorator;

import com.designpatterns.structural.decorator.exercise_2.meal.Meal;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    public void addSauce() {
        System.out.println("Sauce added into meal.");
    }

}
