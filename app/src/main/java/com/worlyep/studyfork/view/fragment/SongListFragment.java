package com.worlyep.studyfork.view.fragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.model.Song;
import com.worlyep.studyfork.view.activity.SearchActivity;
import com.worlyep.studyfork.view.adapter.SimpleFragmentPagerAdapter;
import com.worlyep.studyfork.view.adapter.SongListAdapter;
import com.worlyep.studyfork.databinding.FragmentSongListBinding;
import com.worlyep.studyfork.viewmodel.SongListViewModel;

import java.util.List;

public class SongListFragment extends Fragment {
    public static final String ARG_SONG_TYPE = "arg.type";
    private FragmentSongListBinding mBinding;
    private int mTabType;
    private SongListAdapter mSongAdapter = new SongListAdapter();

    public static SongListFragment newInstance(int type) {
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SONG_TYPE, type);
        SongListFragment fragment = new SongListFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final SongListViewModel viewModel = ViewModelProviders.of(this).get(SongListViewModel.class);

        observeViewModel(viewModel);

    }

    private void observeViewModel(SongListViewModel viewModel) {
        viewModel.getSongListObservable().observe(this, (songs) -> {
            if (songs != null) {
                Log.d("sgc109_debug", "setSongList()!");
                mSongAdapter.setSongList(songs);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTabType = getArguments().getInt(ARG_SONG_TYPE);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_song_list, container, false);
        RecyclerView recyclerView = mBinding.allSongListRecyclerView;
        final SongListViewModel viewModel = ViewModelProviders.of(this).get(SongListViewModel.class);

        recyclerView.setAdapter(new SongListAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        return mBinding.getRoot();
    }
}