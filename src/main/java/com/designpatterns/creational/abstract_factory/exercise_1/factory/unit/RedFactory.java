package com.designpatterns.creational.abstract_factory.exercise_1.factory.unit;

import com.designpatterns.creational.abstract_factory.exercise_1.factory.*;

public class RedFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        return switch (unitType) {
            case RIFLEMAN -> new Rifleman(250, 0, 5);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        return switch (unitType) {
            case TANK -> new Tank(800, 0, 80);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        return switch (unitType) {
            case HELICOPTER -> new Helicopter(2500, 0, 25);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }
}
