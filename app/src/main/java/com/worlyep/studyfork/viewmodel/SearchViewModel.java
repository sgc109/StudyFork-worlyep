package com.worlyep.studyfork.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.view.View;

public class SearchViewModel implements ViewModel{
    public Context context;

    public View.OnClickListener onBackClick = view -> {
        ((Activity)this.context).finish();
    };

    public SearchViewModel(Context context){
        this.context = context;
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
