package com.designpatterns.behavioral.command.exercise_2.music;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;


    public void playFirstTrack() {
        System.out.println("Play first: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Play next: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random random = new Random();
        int number = random.nextInt(
                0,
                Integer.parseInt(String.valueOf(tracks.size()))
        );
        System.out.println("Play random: " + tracks.get(number));

    }

}
