package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private ClassicalMusic classicalMusic;
    private Music music;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, @Qualifier("tranceMusic") Music music, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.music = music;
        this.rockMusic = rockMusic;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public String playMusic(MusicType type) {
        Random random = new Random();
        int i = random.nextInt(3);
        switch (type) {
            case ROCK:
                return "Playing "+rockMusic.getSongs().get(i);
            case TRANCE:
                return "Playing "+music.getSongs().get(i);
            case CLASSICAL:
                return "Playing "+classicalMusic.getSongs().get(i);
        }
        return "Playing: ";
    }
}
