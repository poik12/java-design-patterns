package com.designpatterns.structural.decorator.exercise_1.decorator;

import com.designpatterns.structural.decorator.exercise_1.terrain.Terrain;

public class SwampDecorator extends TerrainDecorator {

    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() + 15;
    }
}
