package com.designpatterns.structural.facade.exercise_1.deliverybox;

public class DeliveryBoxFacade {

    private final DeliveryBox deliveryBox;
    private final DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {
        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
