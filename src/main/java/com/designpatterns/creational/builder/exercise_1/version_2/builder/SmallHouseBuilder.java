package com.designpatterns.creational.builder.exercise_1.version_2.builder;

import com.designpatterns.creational.builder.exercise_1.version_2.House;

public class SmallHouseBuilder implements HouseBuilder{

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small floors");
    }

    @Override
    public void buildRoofs() {
        this.house.setRoof("small roofs");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("small windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("small doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("small garage");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small rooms");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
