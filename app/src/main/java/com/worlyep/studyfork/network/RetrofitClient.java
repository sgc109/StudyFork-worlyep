package com.worlyep.studyfork.network;

import com.worlyep.studyfork.BuildConfig;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //로컬서버
    public static final String BASE_URL = "https://api.manana.kr/";
    //외부서버
    //private static final String BASE_URL = "http://sgc109.pythonanywhere.com/";
    private static Retrofit retrofit = null;

        public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .client(OkHttpGenerator.getInstance(BuildConfig.DEBUG))
                    .build();
        }
        return retrofit;
    }

}
