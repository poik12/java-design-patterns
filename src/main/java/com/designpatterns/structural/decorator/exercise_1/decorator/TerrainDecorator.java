package com.designpatterns.structural.decorator.exercise_1.decorator;

import com.designpatterns.structural.decorator.exercise_1.terrain.Terrain;

public abstract class TerrainDecorator extends Terrain {

    protected Terrain terrain;

    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain = terrain;
    }
}
