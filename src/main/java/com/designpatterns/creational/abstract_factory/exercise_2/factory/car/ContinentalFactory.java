package com.designpatterns.creational.abstract_factory.exercise_2.factory.car;

import com.designpatterns.creational.abstract_factory.exercise_2.factory.BMWModel;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.Car;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.Factory;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.FordModel;

public class ContinentalFactory implements Factory {

    @Override
    public Car buildFord(FordModel fordModel) {
        return switch (fordModel) {
            case CMAX -> new Ford(100, "Diesel", "2021", "LEFT");
        };
    }

    @Override
    public Car buildBmw(BMWModel bmwModel) {
        return switch (bmwModel) {
            case E60 -> new BMW(100, "Pb95", "2010", "LEFT");
        };
    }
}
