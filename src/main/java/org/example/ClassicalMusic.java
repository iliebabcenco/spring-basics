package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    public ClassicalMusic() {
        System.out.println("doing my constructor in classical music");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("go through factory method");
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
