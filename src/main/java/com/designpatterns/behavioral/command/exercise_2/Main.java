package com.designpatterns.behavioral.command.exercise_2;

import com.designpatterns.behavioral.command.exercise_2.music.MusicPlayer;
import com.designpatterns.behavioral.command.exercise_2.music.MusicPlayerRemote;
import com.designpatterns.behavioral.command.exercise_2.music.command.PlayFirstTrackCommand;
import com.designpatterns.behavioral.command.exercise_2.music.command.PlayNextTrackCommand;
import com.designpatterns.behavioral.command.exercise_2.music.command.PlayRandomTrackCommand;

public class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
    }

}
