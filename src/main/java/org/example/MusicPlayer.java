package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private AlterRock alterRock;
    private ClassicalMusic classicalMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(AlterRock music, ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.alterRock = music;
    }

    public String playMusic() {
        return "Play: " + this.classicalMusic.getSong() + " & " + this.alterRock.getSong();
    }
}
