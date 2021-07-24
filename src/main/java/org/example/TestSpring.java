package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer == secondMusicPlayer);

        firstMusicPlayer.setName("first music player");
        System.out.println(secondMusicPlayer.getName());

        System.out.println(firstMusicPlayer.getName()+ " " + firstMusicPlayer.getVolume());

        context.close();
    }
}
