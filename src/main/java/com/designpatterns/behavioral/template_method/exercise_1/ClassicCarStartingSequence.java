package com.designpatterns.behavioral.template_method.exercise_1;

public class ClassicCarStartingSequence extends CarStartingSequence {

    @Override
    public void startTheIgnition() {
        System.out.println("Start the engine");
    }

    @Override
    public void setTheGear() {
        System.out.println("set the gear");
    }

}
