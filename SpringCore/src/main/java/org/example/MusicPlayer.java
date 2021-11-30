package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(){
      music.getSong();
    }

    @PostConstruct
    void InitMethod(){
        System.out.println("Init");
    }

    @PreDestroy
    void DestroyMethod(){
        System.out.println("Destroy");
    }
}
