package com.worlyep.studyfork.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

public class SearchViewModel extends AndroidViewModel implements BaseViewModel{

    public View.OnClickListener onBackClick = view -> {
        ((Activity)view.getContext()).finish();
    };

    public SearchViewModel(@NonNull Application application) {
        super(application);
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
}
