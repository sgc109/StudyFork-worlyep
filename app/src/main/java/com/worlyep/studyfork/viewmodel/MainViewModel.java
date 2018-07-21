package com.worlyep.studyfork.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.worlyep.studyfork.view.activity.SearchActivity;
import com.worlyep.studyfork.view.adapter.SimpleFragmentPagerAdapter;

public class MainViewModel implements ViewModel {
    public static String TAG = "sgc109_debug";
    public PagerAdapter adapter;
    public Context context;

    public MainViewModel(Context context) {
        this.context = context;
        adapter = new SimpleFragmentPagerAdapter(context, ((FragmentActivity) context).getSupportFragmentManager());
    }

    public ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            Log.d(TAG, "onPageSelected!");
            super.onPageSelected(position);
        }
    };

    public View.OnClickListener onClickSearch = (view) -> {
        Intent intent = SearchActivity.newInstance(context);
        context.startActivity(intent);
    };

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
