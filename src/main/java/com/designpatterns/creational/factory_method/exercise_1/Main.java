package com.designpatterns.creational.factory_method.exercise_1;

import com.designpatterns.creational.factory_method.exercise_1.factory.Factory;
import com.designpatterns.creational.factory_method.exercise_1.factory.unit.Unit;
import com.designpatterns.creational.factory_method.exercise_1.factory.unit.UnitFactory;
import com.designpatterns.creational.factory_method.exercise_1.factory.UnityType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnityType.TANK);
        System.out.println(tank);

        Unit rifleman = factory.createUnit(UnityType.RIFLEMAN);
        System.out.println(rifleman);
    }
}
