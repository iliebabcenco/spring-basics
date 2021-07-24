package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music rockMusic = context.getBean("rockMusic", RockMusic.class);

//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);

//        musicPlayer.playMusic();
//        rockMusicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        context.close();
    }
}
