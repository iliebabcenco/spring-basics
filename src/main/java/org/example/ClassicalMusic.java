package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("classical song nr. 1");
        musicList.add("classical song nr. 2");
        musicList.add("classical song nr. 3");
    }

    private ClassicalMusic() {
        System.out.println("doing my constructor in classical music");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("go through factory method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
