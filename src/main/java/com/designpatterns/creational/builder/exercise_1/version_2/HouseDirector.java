package com.designpatterns.creational.builder.exercise_1.version_2;

import com.designpatterns.creational.builder.exercise_1.version_2.builder.HouseBuilder;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildDoors();
        houseBuilder.buildFloors();
        houseBuilder.buildGarage();
        houseBuilder.buildRoofs();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        houseBuilder.buildWalls();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
