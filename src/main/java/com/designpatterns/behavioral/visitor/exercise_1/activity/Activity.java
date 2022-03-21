package com.designpatterns.behavioral.visitor.exercise_1.activity;

import com.designpatterns.behavioral.visitor.exercise_1.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);

}
