package com.designpatterns.structural.decorator.exercise_1;

import com.designpatterns.structural.decorator.exercise_1.decorator.ForestDecorator;
import com.designpatterns.structural.decorator.exercise_1.decorator.RoadDecorator;
import com.designpatterns.structural.decorator.exercise_1.decorator.SwampDecorator;
import com.designpatterns.structural.decorator.exercise_1.terrain.HillTerrain;
import com.designpatterns.structural.decorator.exercise_1.terrain.PlainTerrain;
import com.designpatterns.structural.decorator.exercise_1.terrain.Terrain;

public class Main {


    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new PlainTerrain();
        System.out.println("Plain terrain fuel cost: " + terrain.fuelCost());

        Terrain terrain1 = new HillTerrain();
        System.out.println("Hill terrain fuel cost: " + terrain1.fuelCost());

        Terrain terrain2 = new SwampDecorator(new HillTerrain());
        System.out.println("Swamp hill terrain flues cost: " + terrain2.fuelCost());

        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new PlainTerrain()));
        System.out.println("Swamp forrest plain terrain fuel cost:" + terrain3.fuelCost());

        Terrain terrain5 = new RoadDecorator(terrain3);
        System.out.println(terrain5.getDescription() + " Fuel cost: " + terrain3.fuelCost());
    }

}
