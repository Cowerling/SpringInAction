package com.cowerling.soundsystem;

import java.util.List;
/**
 * Created by cowerling on 16-12-13.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {}

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void playTrack(int trackNumber) {
        System.out.println("-Track: " + tracks.get(trackNumber - 1));
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
