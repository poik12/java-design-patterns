package com.designpatterns.behavioral.visitor.exercise_2.visitor;

import com.designpatterns.behavioral.visitor.exercise_2.transport.Animal;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Person;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Animal kind: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: " + person.getFirstName()
                + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Ship designation: "
                + shipment.getPrefix() + "-" + shipment.getSerialNumber());
    }
}
