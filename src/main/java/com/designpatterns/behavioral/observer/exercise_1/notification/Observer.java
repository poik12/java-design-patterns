package com.designpatterns.behavioral.observer.exercise_1.notification;

import com.designpatterns.behavioral.observer.exercise_1.order.Order;

public interface Observer {

    void update(Order order);
}
