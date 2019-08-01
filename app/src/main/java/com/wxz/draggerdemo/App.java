package com.wxz.draggerdemo;

import android.app.Application;

import com.wxz.draggerdemo.data.DataRepository;
import com.wxz.draggerdemo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class App extends DaggerApplication {
//    @Inject
//    DataRepository dataRepository;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

//    public DataRepository getDataRepository() {
//        return dataRepository;
//    }
}
