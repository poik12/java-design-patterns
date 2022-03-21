package com.designpatterns.behavioral.command.exercise_2.music.command;

import com.designpatterns.behavioral.command.exercise_2.music.MusicPlayer;

public class PlayRandomTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayRandomTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }

}
