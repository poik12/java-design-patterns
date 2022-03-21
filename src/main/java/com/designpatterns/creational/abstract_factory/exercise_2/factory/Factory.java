package com.designpatterns.creational.abstract_factory.exercise_2.factory;

import com.designpatterns.creational.abstract_factory.exercise_2.factory.car.Ford;

public interface Factory {

    Car buildFord(FordModel fordModel);
    Car buildBmw(BMWModel bmwModel);

}
