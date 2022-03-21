package com.designpatterns.behavioral.chain_of_responsibility.exercise_2.child;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_2.MotherRequest;

public class HighChild extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("High child took the jar of the shelf");
        } else {
            System.out.println("Wrong shelf type.");
        }
    }

}
