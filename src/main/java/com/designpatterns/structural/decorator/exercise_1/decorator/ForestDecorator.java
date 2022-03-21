package com.designpatterns.structural.decorator.exercise_1.decorator;

import com.designpatterns.structural.decorator.exercise_1.terrain.Terrain;

public class ForestDecorator extends TerrainDecorator {

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() + 5;
    }
}
