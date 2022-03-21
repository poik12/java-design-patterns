package com.designpatterns.behavioral.chain_of_responsibility.exercise_2;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_2.child.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
