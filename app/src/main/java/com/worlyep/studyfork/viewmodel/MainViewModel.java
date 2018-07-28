package com.worlyep.studyfork.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.worlyep.studyfork.view.activity.SearchActivity;
import com.worlyep.studyfork.view.adapter.SimpleFragmentPagerAdapter;

public class MainViewModel extends AndroidViewModel implements BaseViewModel {
    public static String TAG = "sgc109_debug";

    public MainViewModel(Application application) {
        super(application);
    }

    public ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            Log.d(TAG, "onPageSelected!");
            super.onPageSelected(position);
        }
    };

    public void onClickSearch(View view){
        Context context = view.getContext();
        Intent intent = SearchActivity.newInstance(context);
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
