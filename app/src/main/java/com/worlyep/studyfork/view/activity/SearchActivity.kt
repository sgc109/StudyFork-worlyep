package com.worlyep.studyfork.view.activity

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.worlyep.studyfork.R
import com.worlyep.studyfork.databinding.ActivitySearchBinding
import com.worlyep.studyfork.viewmodel.SearchViewModel

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(SearchViewModel::class.java)
        val binding = DataBindingUtil.setContentView<ActivitySearchBinding>(this, R.layout.activity_search)
        binding.viewmodel = viewModel
        setSupportActionBar(binding.tbSearch)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, SearchActivity::class.java)
        }
    }
}
