package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer player = new MusicPlayer(rockMusic);
        player.playMusic();

        AlterRock alterRock = context.getBean("alterRock", AlterRock.class);
        MusicPlayer player2 = new MusicPlayer(alterRock);
        player2.playMusic();

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer player3 = new MusicPlayer(classicalMusic);
        player3.playMusic();
        context.close();
    }
}
