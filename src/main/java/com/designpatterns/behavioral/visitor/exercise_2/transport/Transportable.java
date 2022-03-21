package com.designpatterns.behavioral.visitor.exercise_2.transport;

import com.designpatterns.behavioral.visitor.exercise_2.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
