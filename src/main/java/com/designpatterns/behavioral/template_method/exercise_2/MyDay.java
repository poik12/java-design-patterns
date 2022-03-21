package com.designpatterns.behavioral.template_method.exercise_2;

public class MyDay extends WeekDay  {

    @Override
    protected int goToWork(TypeOfTransport transport) {
        return switch (transport) {
            case CAR -> 15;
            case BIKE -> 25;
            case TRAM -> 20;
        };
    }

    @Override
    protected void work() {
        System.out.println("Work");
    }
}
