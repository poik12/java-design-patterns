package com.designpatterns.behavioral.memento.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private List<OperatingSystemMemento> mementos = new ArrayList<>();

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        mementos.add(operatingSystemMemento);
    }

    public OperatingSystemMemento getMemento(int index) {
        return mementos.get(index);
    }

}
