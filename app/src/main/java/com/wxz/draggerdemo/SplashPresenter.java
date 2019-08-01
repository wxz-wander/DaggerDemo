package com.wxz.draggerdemo;

import androidx.annotation.Nullable;

import com.wxz.draggerdemo.data.DataRepository;
import com.wxz.draggerdemo.data.ServiceApi;

import javax.inject.Inject;

public class SplashPresenter implements SplashContact.Presenter {
    @Nullable
    private SplashContact.View mSplashView;
    private ServiceApi mServiceApi;

    @Inject
    public SplashPresenter(ServiceApi serviceApi){

    }
    @Override
    public void takeView(SplashContact.View view) {
        mSplashView = view;
    }

    @Override
    public void dropView() {
        mSplashView = null;
    }

    @Override
    public void loadConfig() {
        //todo load config
    }
}
