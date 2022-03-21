package com.designpatterns.behavioral.memento.exercise_1.smart_app;

public class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
