package com.designpatterns.behavioral.visitor.exercise_1.activity;

import com.designpatterns.behavioral.visitor.exercise_1.visitor.Visitor;

public class Weights implements Activity {

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
