package com.designpatterns.behavioral.visitor.exercise_1.visitor;

import com.designpatterns.behavioral.visitor.exercise_1.activity.Squash;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Treadmill;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Weights;

public class VisitorCaloriesBurnedImpl implements Visitor {

    @Override
    public void visit(Treadmill treadmill) {
            System.out.println("Calories burned running on treadmill: " + treadmill.getDistance() * 5);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: " + weights.getWeight() * weights.getReps() * 2);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + squash.getMinutesPlayed() * 20);
    }
}
