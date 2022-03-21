package com.designpatterns.behavioral.command.exercise_2.music.command;

import com.designpatterns.behavioral.command.exercise_2.music.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
