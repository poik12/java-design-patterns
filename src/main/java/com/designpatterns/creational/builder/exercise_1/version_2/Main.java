package com.designpatterns.creational.builder.exercise_1.version_2;

import com.designpatterns.creational.builder.exercise_1.version_2.builder.BigHouseBuilder;
import com.designpatterns.creational.builder.exercise_1.version_2.builder.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();
        House smallHouse = smallHouseDirector.getHouse();
        System.out.println(smallHouse);

        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();
        House bigHouse = bigHouseDirector.getHouse();
        System.out.println(bigHouse);

    }
}
