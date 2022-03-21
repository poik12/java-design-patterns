package com.designpatterns.creational.factory_method.exercise_1.factory;

import com.designpatterns.creational.factory_method.exercise_1.factory.unit.Unit;

public abstract class Factory {

    abstract public Unit createUnit(UnityType unityType);

}
