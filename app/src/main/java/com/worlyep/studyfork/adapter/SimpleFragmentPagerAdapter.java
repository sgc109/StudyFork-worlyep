package com.worlyep.studyfork.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.worlyep.studyfork.constant.TabType;
import com.worlyep.studyfork.fragment.SongListFragment;

import java.util.ArrayList;
import java.util.List;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private List<Fragment> mFragments;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        mFragments = new ArrayList<>();
        mFragments.add(SongListFragment.newInstance(TabType.MYSONG));
        mFragments.add(SongListFragment.newInstance(TabType.ALL));
        mFragments.add(SongListFragment.newInstance(TabType.FAVORITE));
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}