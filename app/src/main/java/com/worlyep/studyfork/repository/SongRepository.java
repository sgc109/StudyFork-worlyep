package com.worlyep.studyfork.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.worlyep.studyfork.model.Song;
import com.worlyep.studyfork.network.RetrofitClient;
import com.worlyep.studyfork.network.SongService;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SongRepository {
    private static SongRepository sInstance;

    public static SongRepository getInstance(){
        if(sInstance == null){
            sInstance = new SongRepository();
        }
        return sInstance;
    }
    private SongRepository(){

    }
    public LiveData<List<Song>> getSongList(){
        final MutableLiveData<List<Song>> data = new MutableLiveData<>();
        RetrofitClient.getClient()
                .create(SongService.class)
                .getSongList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(response -> response.body())
                .subscribe(songs -> data.setValue(songs),
                        throwable -> { Log.d("sgc109", throwable.getMessage()); });
//                .enqueue(new Callback<List<Song>>() {
//            @Override
//            public void onResponse(Call<List<Song>> call, Response<List<Song>> response) {
//                if(response.code() == 200) {
//                    Log.d("sgc109_debug", "onReponse : 200 OK!\n");
//                    data.setValue(response.body());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Song>> call, Throwable t) {
//
//            }
//        });
        return data;
    }
}
