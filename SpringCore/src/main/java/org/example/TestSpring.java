package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer.getName() +" "+ firstMusicPlayer.getVolume());

        System.out.println(firstMusicPlayer == secondMusicPlayer);

        context.close();
    }

}
