package com.designpatterns.creational.abstract_factory.exercise_1;

import com.designpatterns.creational.abstract_factory.exercise_1.factory.*;
import com.designpatterns.creational.abstract_factory.exercise_1.factory.unit.BlueFactory;
import com.designpatterns.creational.abstract_factory.exercise_1.factory.unit.RedFactory;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        System.out.println("RED ARMY -----------------------------");
        InfantryUnit blueInfantryUnit = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        System.out.println(blueInfantryUnit);

        MechanizedUnit blueMechanizedUnit = blueFactory.createMechanizedUnit(UnitType.TANK);
        System.out.println(blueMechanizedUnit);

        AirUnit blueAirUnit = blueFactory.createAirUnit(UnitType.HELICOPTER);
        System.out.println(blueAirUnit);

        System.out.println("BLUE ARMY -----------------------------");
        InfantryUnit redInfantryUnit = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        System.out.println(redInfantryUnit);

        MechanizedUnit redMechanizedUnit = redFactory.createMechanizedUnit(UnitType.TANK);
        System.out.println(redMechanizedUnit);

        AirUnit redAirUnit = redFactory.createAirUnit(UnitType.HELICOPTER);
        System.out.println(redAirUnit);

    }
}
