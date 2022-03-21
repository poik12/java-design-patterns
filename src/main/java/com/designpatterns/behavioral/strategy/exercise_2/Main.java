package com.designpatterns.behavioral.strategy.exercise_2;

public class Main {

    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setPricingStrategy(new RegularPrice());

        priceCalculator.calculate(100, true);
        System.out.println("--------------------------");
        priceCalculator.calculate(100, false);
        System.out.println("--------------------------");

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);
        System.out.println("--------------------------");
        priceCalculator.calculate(100, false);
        System.out.println("--------------------------");

    }

}
