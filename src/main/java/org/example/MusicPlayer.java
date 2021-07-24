package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public String playMusic() {
        Random random = new Random();
        int i = random.nextInt(3);
        return "Playing: "+musicList.get(i).getSongs().get(i);
    }
}
