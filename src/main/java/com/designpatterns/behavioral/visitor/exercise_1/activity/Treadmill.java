package com.designpatterns.behavioral.visitor.exercise_1.activity;

import com.designpatterns.behavioral.visitor.exercise_1.visitor.Visitor;

public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
