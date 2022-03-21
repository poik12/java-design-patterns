package com.designpatterns.creational.abstract_factory.exercise_2;

import com.designpatterns.creational.abstract_factory.exercise_2.factory.BMWModel;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.Car;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.Factory;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.FordModel;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.car.CommonwealthFactory;
import com.designpatterns.creational.abstract_factory.exercise_2.factory.car.ContinentalFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        Factory commonwealthFactory = new CommonwealthFactory();

        Car commonBmw = commonwealthFactory.buildBmw(BMWModel.E60);
        System.out.println(commonBmw.getSteeringWheelPosition());
        System.out.println(commonBmw);
        Car commonFord = commonwealthFactory.buildFord(FordModel.CMAX);
        System.out.println(commonFord.getSteeringWheelPosition());
        System.out.println(commonFord);

        System.out.println("---------------------------------------");
        Factory continentalFactory = new ContinentalFactory();

        Car continentalBmw = continentalFactory.buildBmw(BMWModel.E60);
        System.out.println(continentalBmw.getSteeringWheelPosition());
        System.out.println(continentalBmw);

        Car continentalFord = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(continentalFord.getSteeringWheelPosition());
        System.out.println(continentalFord);
    }
}
