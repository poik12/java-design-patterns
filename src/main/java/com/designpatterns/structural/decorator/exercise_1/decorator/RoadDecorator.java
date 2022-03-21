package com.designpatterns.structural.decorator.exercise_1.decorator;

import com.designpatterns.structural.decorator.exercise_1.terrain.Terrain;

public class RoadDecorator extends TerrainDecorator {

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() - 10;
    }

    @Override
    public String getDescription() {
        return terrain.getDescription() + "There is road ahead.";
    }
}
