package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private AlterRock music;
    private String name;
    private int volume;

    public MusicPlayer(AlterRock music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(AlterRock music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Play: " + this.music.getSong());
    }
}
