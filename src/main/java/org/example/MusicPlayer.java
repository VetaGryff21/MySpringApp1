package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music classic;
    private Music alter;
    private Music rock;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classic,
                       @Qualifier("alterRock") Music alter,
                       @Qualifier("rockMusic") Music rock) {
        this.classic = classic;
        this.alter = alter;
        this.rock = rock;
    }

    public String playMusic(Genre genre) {
        if (genre == Genre.ROCK)
            return rock.getRandomSong();
        if (genre == Genre.ALTER)
            return alter.getRandomSong();
        if (genre == Genre.CLASSICAL)
            return classic.getRandomSong();
        else return "no.";
    }
}
