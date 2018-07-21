package com.worlyep.studyfork.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worlyep.studyfork.R;

public class SongListFragment extends Fragment {
    public static final String ARG_SONG_TYPE = "arg.type";
    private int mTabType;

    public static SongListFragment newInstance(int type){
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SONG_TYPE, type);
        SongListFragment fragment = new SongListFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTabType = getArguments().getInt(ARG_SONG_TYPE);

        return inflater.inflate(R.layout.fragment_song_list, container, false);
    }
}
