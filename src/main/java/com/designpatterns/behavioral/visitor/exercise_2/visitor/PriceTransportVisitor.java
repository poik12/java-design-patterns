package com.designpatterns.behavioral.visitor.exercise_2.visitor;

import com.designpatterns.behavioral.visitor.exercise_2.transport.Animal;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Person;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Shipment;

public class PriceTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Price per kilometer for an animal: $" + animal.getWeight() * 0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Price per kilometer for a person: $" + price);
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price = price * 3;
        }
        System.out.println("Price per kilometer for a shipment: $" + price);
    }
}
