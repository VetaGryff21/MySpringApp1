package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    public ClassicalMusic() {
        musicList.add("Vivaldi - concert 1");
        musicList.add("Vivaldi - concert 2");
        musicList.add("Vivaldi - concert 3");
        musicList.add("Vivaldi - concert 4");
        musicList.add("Vivaldi - concert 5");
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
