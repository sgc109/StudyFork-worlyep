package com.worlyep.studyfork.view.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.constant.TabType;
import com.worlyep.studyfork.view.fragment.SongListFragment;

import java.util.ArrayList;
import java.util.List;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;
    private List<String> mTitles;


    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mFragments.add(SongListFragment.newInstance(TabType.MYSONG));
        mFragments.add(SongListFragment.newInstance(TabType.ALL));
        mFragments.add(SongListFragment.newInstance(TabType.FAVORITE));

        mTitles = new ArrayList<>();
        mTitles.add(context.getString(R.string.tab_title_my));
        mTitles.add(context.getString(R.string.tab_title_all));
        mTitles.add(context.getString(R.string.tab_title_favorite));
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}