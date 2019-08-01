package com.wxz.draggerdemo;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class SplashActivity extends DaggerAppCompatActivity implements SplashContact.View{

    @Inject
    SplashContact.Presenter mPresenter;
    @Override
    public void showErrorDialog() {

    }

    @Override
    public void goMain() {

    }
}
