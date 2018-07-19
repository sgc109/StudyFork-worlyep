package com.worlyep.studyfork;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.worlyep.studyfork.fragment.AllSongListFragment;
import com.worlyep.studyfork.fragment.FavoriteSongListFragment;
import com.worlyep.studyfork.fragment.MySongListFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new MySongListFragment();
        } else if (i == 1) {
            return new AllSongListFragment();
        } else {
            return new FavoriteSongListFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}