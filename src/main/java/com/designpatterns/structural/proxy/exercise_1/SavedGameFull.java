package com.designpatterns.structural.proxy.exercise_1;

public class SavedGameFull implements SavedGame {

    private String name;
    private String gameData;

    @Override
    public void initialize() {
        this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
        this.gameData = loadFromStorage();
    }

    @Override
    public void loadGame() {
        System.out.println("Game loaded");
    }

    @Override
    public String getName() {
        return name;
    }

    private String loadFromStorage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Loaded";
    }
}
