package com.designpatterns.behavioral.chain_of_responsibility.exercise_2;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_2.child.*;

public class Main {

    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child lowChild = new LowChild();
        Child mediumChild = new MediumChild();
        Child highChild = new HighChild();

        lowChild.setTallerChild(mediumChild);
        mediumChild.setTallerChild(highChild);

        lowChild.processRequest(motherRequest);

    }

}
