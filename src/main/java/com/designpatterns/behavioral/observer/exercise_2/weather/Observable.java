package com.designpatterns.behavioral.observer.exercise_2.weather;

import com.designpatterns.behavioral.observer.exercise_2.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
