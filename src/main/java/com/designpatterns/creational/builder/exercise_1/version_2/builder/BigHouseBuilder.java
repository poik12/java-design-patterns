package com.designpatterns.creational.builder.exercise_1.version_2.builder;

import com.designpatterns.creational.builder.exercise_1.version_2.House;

public class BigHouseBuilder implements HouseBuilder{

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void buildRoofs() {
        this.house.setRoof("big roofs");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("big doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("big garage");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big rooms");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
