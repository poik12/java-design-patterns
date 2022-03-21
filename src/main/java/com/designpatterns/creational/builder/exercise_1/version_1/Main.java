package com.designpatterns.creational.builder.exercise_1.version_1;

public class Main {

    public static void main(String[] args) {

        House house = House.HouseBuilder.aHouse()
                .withDoors("doors")
                .withFloors("floors")
                .withGarage("garage")
                .withRoof("roof")
                .build();

        System.out.println(house);

    }
}
