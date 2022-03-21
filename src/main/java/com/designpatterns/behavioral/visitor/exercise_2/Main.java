package com.designpatterns.behavioral.visitor.exercise_2;

import com.designpatterns.behavioral.visitor.exercise_2.transport.Animal;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Person;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Shipment;
import com.designpatterns.behavioral.visitor.exercise_2.transport.Transportable;
import com.designpatterns.behavioral.visitor.exercise_2.visitor.NameTransportVisitor;
import com.designpatterns.behavioral.visitor.exercise_2.visitor.PriceTransportVisitor;
import com.designpatterns.behavioral.visitor.exercise_2.visitor.TransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("John", "Smith", true);
        Person person2 = new Person("John", "Connor", false);
        Shipment shipment = new Shipment("PL", "4344434", false);
        Shipment shipment2 = new Shipment("EN", "4344434", true);

        List<Transportable> transportableList = Arrays.asList(animal, person, person2, shipment, shipment2);

        TransportVisitor nameTransportVisitor = new NameTransportVisitor();
        TransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
        System.out.println("--------------------");
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));

    }
}
