package com.worlyep.studyfork.view.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.worlyep.studyfork.R
import com.worlyep.studyfork.databinding.ItemSongBinding
import com.worlyep.studyfork.model.Song
import java.util.*
import kotlin.collections.ArrayList

class SongListAdapter : RecyclerView.Adapter<SongListAdapter.SongViewHolder>() {
    var mSongs: List<Song> = ArrayList()
        set(songList: List<Song>) {
            field = songList
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SongViewHolder {
        val binding = DataBindingUtil.inflate<ItemSongBinding>(LayoutInflater.from(viewGroup.context), R.layout.item_song, viewGroup, false)
        return SongViewHolder(binding)
    }

    override fun onBindViewHolder(songViewHolder: SongViewHolder, i: Int) {
        songViewHolder.bind(mSongs[i])
    }

    override fun getItemCount(): Int {
        return mSongs.size
    }

    class SongViewHolder(var mBinding: ItemSongBinding) : RecyclerView.ViewHolder(mBinding.root) {
        fun bind(song: Song) {
            mBinding.song = song
            mBinding.executePendingBindings()
        }
    }
}
