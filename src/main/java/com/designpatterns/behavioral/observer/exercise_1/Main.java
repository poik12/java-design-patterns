package com.designpatterns.behavioral.observer.exercise_1;

import com.designpatterns.behavioral.observer.exercise_1.notification.Email;
import com.designpatterns.behavioral.observer.exercise_1.notification.MobileApp;
import com.designpatterns.behavioral.observer.exercise_1.notification.TextMessage;
import com.designpatterns.behavioral.observer.exercise_1.order.Order;
import com.designpatterns.behavioral.observer.exercise_1.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        System.out.println("-----------------------");
        order.notifyObservers();

        System.out.println("-----------------------");
        order.unregisterObserver(email);
        order.setOrderStatus(OrderStatus.SENT);
        order.notifyObservers();

        System.out.println("-----------------------");
        order.setOrderStatus(OrderStatus.RECEIVED);
        order.notifyObservers();

    }
}
