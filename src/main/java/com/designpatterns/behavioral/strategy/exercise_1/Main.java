package com.designpatterns.behavioral.strategy.exercise_1;

import com.designpatterns.behavioral.strategy.exercise_1.chef.Chef;
import com.designpatterns.behavioral.strategy.exercise_1.egg_cooker.HardBoiledEggCooker;
import com.designpatterns.behavioral.strategy.exercise_1.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Gessler");

        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();



    }
}
