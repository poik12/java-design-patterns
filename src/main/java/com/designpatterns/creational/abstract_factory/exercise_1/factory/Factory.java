package com.designpatterns.creational.abstract_factory.exercise_1.factory;

public abstract class Factory {

    abstract public InfantryUnit createInfantryUnit(UnitType unitType);
    abstract public MechanizedUnit createMechanizedUnit(UnitType unitType);
    abstract public AirUnit createAirUnit(UnitType unitType);
}
