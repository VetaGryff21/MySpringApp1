package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player){
        this.player = player;
        this.id = 1;
    }

    @Override
    public String toString(){
        return "Computer: " + id
                + "\nPlayer: " + player.getName()
                + "\nVolume: " + player.getVolume()
                + "\nSong: " + player.playMusic();
    }
}
