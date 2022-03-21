package com.designpatterns.behavioral.observer.exercise_1.order;

import com.designpatterns.behavioral.observer.exercise_1.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
