package com.designpatterns.creational.abstract_factory.exercise_1.factory.unit;

import com.designpatterns.creational.abstract_factory.exercise_1.factory.AirUnit;

public class Helicopter extends AirUnit {

    protected Helicopter(int hp, int exp, int dmgDone) {
        super(hp, exp, dmgDone);
    }
}
