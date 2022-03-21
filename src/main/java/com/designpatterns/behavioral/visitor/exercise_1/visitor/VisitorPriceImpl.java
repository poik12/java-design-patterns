package com.designpatterns.behavioral.visitor.exercise_1.visitor;

import com.designpatterns.behavioral.visitor.exercise_1.activity.Squash;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Treadmill;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Weights;

public class VisitorPriceImpl implements Visitor {

    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Price for treadmill equals 50$");
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Price for weight lifting equals 20$");
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Price for squash equals 80$");
    }

}
