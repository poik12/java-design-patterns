package com.designpatterns.behavioral.command.exercise_2.music;

import com.designpatterns.behavioral.command.exercise_2.music.command.MusicPlayerCommand;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public MusicPlayerCommand getMusicPlayerCommand() {
        return musicPlayerCommand;
    }

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        getMusicPlayerCommand().play();
    }
}
