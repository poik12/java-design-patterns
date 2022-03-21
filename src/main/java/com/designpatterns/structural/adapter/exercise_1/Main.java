package com.designpatterns.structural.adapter.exercise_1;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        ContinentalDevice polishRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Polish Music plays.");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(polishRadio);

        System.out.println("---------------------------");
        UKDevice englishRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("UK Music plays");
            }
        };

        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(englishRadio);


        System.out.println("----------ONE-WAY--------------");
        UKToContinentalAdapter oneWayAdapter = new UKToContinentalAdapter(englishRadio);
        continentalSocket.plugIn(oneWayAdapter);

        System.out.println("----------TWO-WAY--------------");
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(englishRadio, polishRadio);
        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);


    }

}
