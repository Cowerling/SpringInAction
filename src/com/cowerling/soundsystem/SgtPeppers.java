package com.cowerling.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by cowerling on 16-11-20.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void playTrack(int trackNumber) {

    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
