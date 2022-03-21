package com.designpatterns.structural.adapter.exercise_1;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    UKDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }
}
