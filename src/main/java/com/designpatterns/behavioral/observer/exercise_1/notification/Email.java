package com.designpatterns.behavioral.observer.exercise_1.notification;

import com.designpatterns.behavioral.observer.exercise_1.order.Order;

public class Email implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Email - order number: " + order.getOrderNumber() +
                " has changed it status on: " + order.getOrderStatus());
    }
}
