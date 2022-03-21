package com.designpatterns.behavioral.chain_of_responsibility.exercise_2.child;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_2.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public Child getTallerChild() {
        return tallerChild;
    }
}
