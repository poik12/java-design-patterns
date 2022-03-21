package com.designpatterns.structural.facade.exercise_1.deliverybox;

class DeliveryBox {

    boolean isDeliveryBoxFull() {
        System.out.println("Delivery box is not full.");
        return false;
    }

    boolean isDeliveryBoxBroken() {
        System.out.println("Delivery box is not broken.");
        return false;
    }

    void getUserData() {
        System.out.println("User data entered.");
    }

    void openBox() {
        System.out.println("Box opened.");
    }

}
