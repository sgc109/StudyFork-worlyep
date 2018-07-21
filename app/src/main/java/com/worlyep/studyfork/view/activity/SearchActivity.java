package com.worlyep.studyfork.view.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.worlyep.studyfork.R;
import com.worlyep.studyfork.databinding.ActivitySearchBinding;
import com.worlyep.studyfork.viewmodel.SearchViewModel;

public class SearchActivity extends AppCompatActivity {

    SearchViewModel mViewModel;

    public static Intent newInstance(Context context) {
        Intent intent = new Intent(context, SearchActivity.class);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = new SearchViewModel(this);
        ActivitySearchBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        binding.setViewmodel(mViewModel);
        setSupportActionBar(binding.tbSearch);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }
}
