package com.designpatterns.behavioral.visitor.exercise_2.visitor;

import com.designpatterns.behavioral.visitor.exercise_2.transport.Animal;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Person;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);

}
