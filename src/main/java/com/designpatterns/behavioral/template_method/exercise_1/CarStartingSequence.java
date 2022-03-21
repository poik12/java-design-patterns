package com.designpatterns.behavioral.template_method.exercise_1;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void fastenSeatbelts() {
        System.out.println("Fasten seatbelts");
    }

    private void go() {
        System.out.println("Go");
    }

    public abstract void startTheIgnition();

    public abstract void setTheGear();

}
