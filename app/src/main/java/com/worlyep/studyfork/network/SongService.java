package com.worlyep.studyfork.network;

import com.worlyep.studyfork.model.Song;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SongService {
    @GET("/karaoke/kumyoung.json/")
    Call<List<Song>> getSongList();
}
