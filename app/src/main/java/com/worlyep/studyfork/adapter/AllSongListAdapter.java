package com.worlyep.studyfork.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worlyep.studyfork.R;

public class AllSongListAdapter extends RecyclerView.Adapter<AllSongListAdapter.AllSongViewHolder>{

    @NonNull
    @Override
    public AllSongViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_all_song, viewGroup, false);
        AllSongViewHolder holder = new AllSongViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AllSongViewHolder allSongViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class AllSongViewHolder extends RecyclerView.ViewHolder{

        public AllSongViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(){

        }
    }
}
