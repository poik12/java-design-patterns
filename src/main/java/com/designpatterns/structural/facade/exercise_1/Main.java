package com.designpatterns.structural.facade.exercise_1;

import com.designpatterns.structural.facade.exercise_1.deliverybox.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }



}
