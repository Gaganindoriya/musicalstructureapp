package com.gagan.musicalstructureapp;

public class SongBean {

    private String songName;
    private int songImage;

    public SongBean(String songName, int songImage) {
        this.songName = songName;
        this.songImage = songImage;
    }

    public String getSongName() {
        return songName;
    }

    public int getSongImage() {
        return songImage;
    }
}
