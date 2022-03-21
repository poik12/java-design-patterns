package com.designpatterns.behavioral.memento.exercise_2;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Backup no.: " + backupNumber + " was created in " + backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
        System.out.println("Backup no.: " + backupNumber + " was created in " + backupDate);
    }

}
