package com.designpatterns.creational.abstract_factory.exercise_1.factory.unit;

import com.designpatterns.creational.abstract_factory.exercise_1.factory.*;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        return switch (unitType) {
            case RIFLEMAN -> new Rifleman(200, 0, 10);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        return switch (unitType) {
            case TANK -> new Tank(1000, 0, 50);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        return switch (unitType) {
            case HELICOPTER -> new Helicopter(2000, 0, 30);
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }
}
