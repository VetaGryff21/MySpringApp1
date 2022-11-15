package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Player name is " + musicPlayer.getName());
        System.out.println("Player volume is " + musicPlayer.getVolume());
        System.out.println();

        musicPlayer.playMusic();

        System.out.println();
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer==musicPlayer2);
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);

        musicPlayer2.setVolume(15);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
