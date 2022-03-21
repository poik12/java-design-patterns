package com.designpatterns.behavioral.visitor.exercise_1.visitor;

import com.designpatterns.behavioral.visitor.exercise_1.activity.Squash;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Treadmill;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);

    void visit(Weights weights);

    void visit(Squash squash);

}
