package com.designpatterns.creational.factory_method.exercise_1.factory.unit;

import com.designpatterns.creational.factory_method.exercise_1.factory.Factory;
import com.designpatterns.creational.factory_method.exercise_1.factory.UnityType;

public class UnitFactory extends Factory {

    @Override
    public Unit createUnit(UnityType unityType) {

        return switch (unityType) {
            case TANK -> new Tank(200, 0, 20);
            case RIFLEMAN -> new Rifleman(100, 0, 10);
            default -> throw new UnsupportedOperationException("No such type");
        };

    }
}
