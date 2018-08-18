package com.worlyep.studyfork.view.fragment

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.worlyep.studyfork.R
import com.worlyep.studyfork.databinding.FragmentSongListBinding
import com.worlyep.studyfork.view.adapter.SongListAdapter
import com.worlyep.studyfork.viewmodel.SongListViewModel

class SongListFragment : Fragment() {
    private var mBinding: FragmentSongListBinding? = null
    private var mSongAdapter: SongListAdapter? = null
    private var mRecyclerView: RecyclerView? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(SongListViewModel::class.java)

        observeViewModel(viewModel)
    }

    private fun observeViewModel(viewModel: SongListViewModel) {
        viewModel?.songListObservable?.observe(this, Observer { songs ->
            //            if (songs != null) {
            Log.d("sgc109_debug", "setSongList()!")
            mSongAdapter?.mSongs = songs!!
            mRecyclerView?.adapter = mSongAdapter
//            }
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_song_list, container, false)
        mRecyclerView = mBinding!!.allSongListRecyclerView
        val viewModel = ViewModelProviders.of(this).get(SongListViewModel::class.java)
        viewModel.setTabType(arguments!!.getInt(ARG_SONG_TYPE))

        mSongAdapter = SongListAdapter()
        mRecyclerView!!.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return mBinding!!.root
    }

    companion object {
        const val ARG_SONG_TYPE = "arg.type"

        fun newInstance(type: Int): SongListFragment {
            val bundle = Bundle()
            bundle.putInt(ARG_SONG_TYPE, type)
            val fragment = SongListFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
}