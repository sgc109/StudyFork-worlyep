package com.worlyep.studyfork.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.databinding.ActivityMainBinding;
import com.worlyep.studyfork.view.adapter.SimpleFragmentPagerAdapter;
import com.worlyep.studyfork.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new MainViewModel(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(mViewModel);

        ViewPager viewPager = binding.viewpager;
        TabLayout tabLayout = binding.tabLayout;
        tabLayout.setupWithViewPager(viewPager);
    }
}
