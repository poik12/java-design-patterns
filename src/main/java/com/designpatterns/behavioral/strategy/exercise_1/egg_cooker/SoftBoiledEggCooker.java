package com.designpatterns.behavioral.strategy.exercise_1.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Soft boiled eggs cooked");
    }
}
