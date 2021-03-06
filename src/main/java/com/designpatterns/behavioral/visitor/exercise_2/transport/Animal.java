package com.designpatterns.behavioral.visitor.exercise_2.transport;

import com.designpatterns.behavioral.visitor.exercise_2.visitor.TransportVisitor;

public class Animal implements Transportable {

    private String kind;
    private int weight;

    public Animal(String kind, int weight) {
        this.kind = kind;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}
