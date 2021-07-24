package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("rock song nr. 1");
        musicList.add("rock song nr. 2");
        musicList.add("rock song nr. 3");
    }
    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
