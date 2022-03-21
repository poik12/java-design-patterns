package com.designpatterns.behavioral.strategy.exercise_2;

public class RegularPrice implements PricingStrategy{

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("You are not signed up for newsletter");
        }
        System.out.println("Price: " + price);
    }
}
