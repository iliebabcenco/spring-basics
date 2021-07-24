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

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic2);

        TranceMusic tranceMusic = context.getBean("tranceMusic", TranceMusic.class);
        TranceMusic tranceMusic2 = context.getBean("tranceMusic", TranceMusic.class);
        System.out.println(tranceMusic == tranceMusic2);

        context.close();
    }
}
