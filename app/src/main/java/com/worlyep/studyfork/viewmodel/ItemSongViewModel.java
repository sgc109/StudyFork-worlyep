package com.worlyep.studyfork.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;

import com.worlyep.studyfork.model.Song;

public class ItemSongViewModel extends BaseObservable{
    private Context context;
    private Song song;

    public ItemSongViewModel(Context context, Song song){
        this.context = context;
        this.song = song;
    }
}
