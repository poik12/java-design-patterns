package com.designpatterns.behavioral.observer.exercise_1.notification;

import com.designpatterns.behavioral.observer.exercise_1.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Mobile app - order number: " + order.getOrderNumber() +
                " has changed it status on: " + order.getOrderStatus());
    }
}
