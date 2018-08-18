package com.worlyep.studyfork.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.worlyep.studyfork.view.activity.SearchActivity;

public class MainViewModel extends AndroidViewModel implements BaseViewModel {
    public static String TAG = "sgc109_debug";

    public MainViewModel(Application application) {
        super(application);
    }

    public ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
        }
    };

    public void onClickSearch(View view){
        Context context = view.getContext();
        Intent intent = SearchActivity.Companion.newIntent(context);
        context.startActivity(intent);
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
