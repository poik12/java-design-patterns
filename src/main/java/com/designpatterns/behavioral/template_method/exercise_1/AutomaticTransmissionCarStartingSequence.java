package com.designpatterns.behavioral.template_method.exercise_1;

public class AutomaticTransmissionCarStartingSequence extends ClassicCarStartingSequence {

    @Override
    public void startTheIgnition() {
        System.out.println("Click the button");
    }
}
