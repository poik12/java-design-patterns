package com.designpatterns.creational.singleton.exercise_1;

import java.io.Serial;
import java.io.Serializable;

public class GameEngine implements Serializable {

    private int hp = 100;
    private String characterName = "";

//    private static GameEngine instance;
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public static GameEngine getInstance() {
//        if (instance == null) {
//            // protection against multithreading
//            synchronized (GameEngine.class) {
//                if (instance == null) {
//                    instance = new GameEngine();
//                }
//            }
//        }
        return instance;
    }

    // Protection against serialization
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    public void run() {
        while (true) {
            // wait for user input
            // change game state
            // render graphics
        }
    }
}
