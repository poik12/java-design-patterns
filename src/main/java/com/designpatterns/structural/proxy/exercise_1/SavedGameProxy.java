package com.designpatterns.structural.proxy.exercise_1;

public class SavedGameProxy implements SavedGame {

    private String name;
    private SavedGame savedGame;

    @Override
    public void initialize() {
        this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        savedGame = new SavedGameFull();
        savedGame.initialize();
        savedGame.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
