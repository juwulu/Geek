package com.jwl.technology.net;

import com.google.gson.Gson;
import com.jwl.technology.bean.GankBean;
import com.jwl.technology.channel.GankService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lujunwu on 2018/3/19.
 */

public class RetrofitRequest {

    private static GankBean gankBean;

    public static GankBean getGankBean(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GankService gankService = retrofit.create(GankService.class);
        Call<GankBean> gankBean = gankService.getGankBean("Android");
        gankBean.enqueue(new Callback<GankBean>() {
            @Override
            public void onResponse(Call<GankBean> call, Response<GankBean> response) {
                RetrofitRequest.gankBean = response.body();
            }

            @Override
            public void onFailure(Call<GankBean> call, Throwable t) {

            }
        });
        return RetrofitRequest.gankBean;
    }
}
