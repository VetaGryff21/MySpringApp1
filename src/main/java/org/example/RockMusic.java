package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class RockMusic implements Music{
    private List<String> musicList = new ArrayList<>();

    private RockMusic(){
        musicList.add("Aria - 1");
        musicList.add("Aria - 2");
        musicList.add("Aria - 3");
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

    @PostConstruct
    private void init() {
        System.out.println("Do init");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Do destroy");
    }
}
