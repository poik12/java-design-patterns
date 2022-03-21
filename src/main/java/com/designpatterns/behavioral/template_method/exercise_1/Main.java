package com.designpatterns.behavioral.template_method.exercise_1;

public class Main {

    public static void main(String[] args) {

        CarStartingSequence automaticTransmission = new AutomaticTransmissionCarStartingSequence();
        automaticTransmission.startTheCar();

        ClassicCarStartingSequence classicCarStartingSequence = new ClassicCarStartingSequence();
        classicCarStartingSequence.startTheCar();
    }

}
