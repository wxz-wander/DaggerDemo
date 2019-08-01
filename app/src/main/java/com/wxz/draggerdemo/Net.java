package com.wxz.draggerdemo;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Net {
    /**
     * 创建retrofit的api service
     * @param baseUrl baseUrl
     * @param service service
     * */
   public static <T> T createService(String baseUrl, Class<T> service) {
        Retrofit build = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl)
                .client(new OkHttpClient())
                .build();
        return build.create(service);
    }
}
