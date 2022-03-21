package com.designpatterns.behavioral.strategy.exercise_2;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Price: " + price * 0.5);
        } else {
            System.out.println("Price: " + price);
            System.out.println("You are not signed up for newsletter");
        }
    }
}
