package com.designpatterns.behavioral.memento.exercise_2;

public class Main {

    public static void main(String[] args) {

        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.createBackup();

        operatingSystemCaretaker.addMemento(operatingSystem.save());

        OperatingSystemMemento memento = operatingSystemCaretaker.getMemento(0);

        operatingSystem.load(memento);

    }

}
