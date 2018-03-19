package com.jwl.technology.channel;

import com.jwl.technology.bean.GankBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lujunwu on 2018/3/19.
 */

public interface GankService {
    @GET("api/data/{category}/10/1")
    Call<GankBean> getGankBean(@Path("category") String category);
}
