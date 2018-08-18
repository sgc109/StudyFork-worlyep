package com.worlyep.studyfork.network;

import com.worlyep.studyfork.model.Song;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

public interface SongService {
    @GET("/karaoke/kumyoung.json/")
    Observable<Response<List<Song>>> getSongList();
}
