package com.worlyep.studyfork.model;

import com.worlyep.studyfork.constant.KaraokeType;

public class Song {
    private String singer;
    private KaraokeType karaokeTypeType;
    private int code;
    private boolean isFavorites;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public KaraokeType getKaraokeTypeType() {
        return karaokeTypeType;
    }

    public void setKaraokeTypeType(KaraokeType karaokeTypeType) {
        this.karaokeTypeType = karaokeTypeType;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isFavorites() {
        return isFavorites;
    }

    public void setFavorites(boolean favorites) {
        isFavorites = favorites;
    }
}
