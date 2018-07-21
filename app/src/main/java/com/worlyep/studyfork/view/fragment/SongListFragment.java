package com.worlyep.studyfork.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.view.adapter.SongListAdapter;
import com.worlyep.studyfork.databinding.FragmentSongListBinding;
import com.worlyep.studyfork.viewmodel.SongListViewModel;

public class SongListFragment extends Fragment {
    public static final String ARG_SONG_TYPE = "arg.type";
    private SongListViewModel mViewModel;
    private FragmentSongListBinding mBinding;
    private int mTabType;


    public static SongListFragment newInstance(int type) {
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SONG_TYPE, type);
        SongListFragment fragment = new SongListFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTabType = getArguments().getInt(ARG_SONG_TYPE);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_song_list, container, false);
        RecyclerView recyclerView = mBinding.allSongListRecyclerView;
        recyclerView.setAdapter(new SongListAdapter(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        return mBinding.getRoot();
    }
}