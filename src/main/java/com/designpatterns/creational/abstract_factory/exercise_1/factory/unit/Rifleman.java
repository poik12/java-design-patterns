package com.designpatterns.creational.abstract_factory.exercise_1.factory.unit;

import com.designpatterns.creational.abstract_factory.exercise_1.factory.InfantryUnit;

public class Rifleman extends InfantryUnit {

    Rifleman(int hp, int exp, int dmgDone) {
        super(hp, exp, dmgDone);
    }
}
