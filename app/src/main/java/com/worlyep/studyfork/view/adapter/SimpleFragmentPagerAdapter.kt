package com.worlyep.studyfork.view.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

import com.worlyep.studyfork.R
import com.worlyep.studyfork.constant.TabType
import com.worlyep.studyfork.view.fragment.SongListFragment

import java.util.ArrayList

class SimpleFragmentPagerAdapter(context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val mFragments: MutableList<Fragment>
    private val mTitles: MutableList<String>

    init {
        mFragments = ArrayList()
        mFragments.add(SongListFragment.newInstance(TabType.MYSONG))
        mFragments.add(SongListFragment.newInstance(TabType.ALL))
        mFragments.add(SongListFragment.newInstance(TabType.FAVORITE))

        mTitles = ArrayList()
        mTitles.add(context.getString(R.string.tab_title_my))
        mTitles.add(context.getString(R.string.tab_title_all))
        mTitles.add(context.getString(R.string.tab_title_favorite))
    }

    override fun getItem(position: Int): Fragment {
        return mFragments[position]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitles[position]
    }
}