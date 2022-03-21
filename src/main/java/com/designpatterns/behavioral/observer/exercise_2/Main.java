package com.designpatterns.behavioral.observer.exercise_2;

import com.designpatterns.behavioral.observer.exercise_2.notification.InternetNews;
import com.designpatterns.behavioral.observer.exercise_2.notification.RadioNews;
import com.designpatterns.behavioral.observer.exercise_2.notification.TvNews;
import com.designpatterns.behavioral.observer.exercise_2.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        System.out.println("----------------------");
        weatherForecast.notifyObservers();

        System.out.println("----------------------");
        weatherForecast.setPressure(1200);
        weatherForecast.setTemperature(35);
        weatherForecast.notifyObservers();

        System.out.println("----------------------");
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.notifyObservers();
    }

}
