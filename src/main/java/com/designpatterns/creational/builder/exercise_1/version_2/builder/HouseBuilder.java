package com.designpatterns.creational.builder.exercise_1.version_2.builder;

import com.designpatterns.creational.builder.exercise_1.version_2.House;

public interface HouseBuilder {

    void buildWalls();

    void buildFloors();

    void buildRoofs();

    void buildWindows();

    void buildDoors();

    void buildGarage();

    void buildRooms();

    House getHouse();
}
