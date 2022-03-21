package com.designpatterns.creational.singleton.exercise_2;

import java.io.Serial;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {

    private byte guessNumber = 0;
    private byte score = 0;

    private static GuessGame instance = new GuessGame();

    private GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    public byte getScore() {
        return score;
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Round: " + i);
            int randomNumber = random.nextInt(0, 9);
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                this.score++;
            }
            System.out.println(getScore());
            System.out.println("Proper number: " + randomNumber);
        }
        System.out.println("Game ended. Your score: " + getScore());
    }

}
