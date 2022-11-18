package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class AlterRock implements Music{
    private List<String> musicList = new ArrayList<>();

    public AlterRock(){
        musicList.add("LP - One More Light");
        musicList.add("LP - Numb");
        musicList.add("LP - Faint");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }

    @Override
    public String getRandomSong() {
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size()));
    }
}
