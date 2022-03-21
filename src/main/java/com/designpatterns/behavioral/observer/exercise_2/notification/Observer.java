package com.designpatterns.behavioral.observer.exercise_2.notification;

import com.designpatterns.behavioral.observer.exercise_2.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
