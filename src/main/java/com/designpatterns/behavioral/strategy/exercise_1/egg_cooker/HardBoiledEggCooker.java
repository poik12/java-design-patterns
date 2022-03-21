package com.designpatterns.behavioral.strategy.exercise_1.egg_cooker;

public class HardBoiledEggCooker implements EggCooker{
    @Override
    public void cookEgg() {
        System.out.println("Hard boiled eggs cooked.");
    }
}
