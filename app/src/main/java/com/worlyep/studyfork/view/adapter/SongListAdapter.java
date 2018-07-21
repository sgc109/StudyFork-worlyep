package com.worlyep.studyfork.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.databinding.ItemSongBinding;
import com.worlyep.studyfork.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongViewHolder> {
    List<Song> mSongs;
    Context mContext;

    public SongListAdapter(Context context) {
        super();
        mContext = context;
        mSongs = new ArrayList<>();
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemSongBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_song, viewGroup, false);
        SongViewHolder holder = new SongViewHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder songViewHolder, int i) {
        songViewHolder.bind(mSongs.get(i));
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder {
        ItemSongBinding mItemSongBinding;

        public SongViewHolder(ItemSongBinding itemSongBinding) {
            super(itemSongBinding.getRoot());
            mItemSongBinding = itemSongBinding;
        }

        public void bind(Song song) {
            mItemSongBinding.setSong(song);
        }
    }
}
