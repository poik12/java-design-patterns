package com.designpatterns.structural.decorator.exercise_2;

import com.designpatterns.structural.decorator.exercise_2.decorator.ChickenMealDecorator;
import com.designpatterns.structural.decorator.exercise_2.decorator.SauceMealDecorator;
import com.designpatterns.structural.decorator.exercise_2.decorator.ShrimpMealDecorator;
import com.designpatterns.structural.decorator.exercise_2.meal.Meal;
import com.designpatterns.structural.decorator.exercise_2.meal.PotatoMeal;
import com.designpatterns.structural.decorator.exercise_2.meal.RiceMeal;

public class Main {

    public static void main(String[] args) {
        Meal meal1 = new RiceMeal();
        meal1.prepareMeal();

        Meal meal2 = new PotatoMeal();
        meal2.prepareMeal();

        Meal meal3 = new ChickenMealDecorator(new PotatoMeal());
        meal3.prepareMeal();

        Meal meal4 = new ChickenMealDecorator(new SauceMealDecorator(
                new ShrimpMealDecorator(new PotatoMeal())));
        meal4.prepareMeal();

    }

}
