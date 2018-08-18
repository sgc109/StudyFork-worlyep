package com.worlyep.studyfork.view.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v7.app.AppCompatActivity
import com.worlyep.studyfork.R
import com.worlyep.studyfork.databinding.ActivityMainBinding
import com.worlyep.studyfork.view.adapter.SimpleFragmentPagerAdapter
import com.worlyep.studyfork.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    var adapter: PagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = viewModel

        val viewPager = binding.viewpager
        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)

        adapter = SimpleFragmentPagerAdapter(application, supportFragmentManager)
        binding.adapter = adapter
    }
}
