package com.designpatterns.behavioral.observer.exercise_2.notification;

import com.designpatterns.behavioral.observer.exercise_2.weather.WeatherForecast;

public class RadioNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("RadioNews weather forecast - temperature: "
                + weatherForecast.getTemperature() + " pressure: " + weatherForecast.getPressure());
    }
}
