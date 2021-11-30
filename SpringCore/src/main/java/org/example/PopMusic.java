package org.example;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    private PopMusic() {}

    public static PopMusic getPopMusic(){
        return new PopMusic();
    }

    @Override
    public void getSong() {
        System.out.println("Playing Pop Music");
    }
}
