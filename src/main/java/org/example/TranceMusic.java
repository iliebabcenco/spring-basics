package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TranceMusic implements Music{
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("trance song nr. 1");
        musicList.add("trance song nr. 2");
        musicList.add("trance song nr. 3");
    }
    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
