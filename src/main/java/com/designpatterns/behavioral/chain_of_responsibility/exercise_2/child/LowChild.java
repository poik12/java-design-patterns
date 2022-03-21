package com.designpatterns.behavioral.chain_of_responsibility.exercise_2.child;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_2.MotherRequest;

public class LowChild extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Low child took the jar of the shelf");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
