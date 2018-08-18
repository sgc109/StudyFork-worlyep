package com.worlyep.studyfork.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;
import android.support.annotation.NonNull;

import com.worlyep.studyfork.model.Song;
import com.worlyep.studyfork.repository.SongRepository;

import java.util.List;

public class SongListViewModel extends AndroidViewModel implements BaseViewModel{
    private final LiveData<List<Song>> songListObservable;
    ObservableBoolean progBarVisib = new ObservableBoolean();
    private int tabType;

    public SongListViewModel(@NonNull Application application) {
        super(application);

        songListObservable = SongRepository.getInstance().getSongList();
    }

    public LiveData<List<Song>> getSongListObservable() {
        return songListObservable;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    public void setTabType(int tabType) {
        this.tabType = tabType;
    }
}
