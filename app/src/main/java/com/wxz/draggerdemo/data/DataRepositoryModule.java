package com.wxz.draggerdemo.data;

import com.wxz.draggerdemo.di.AppComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataRepositoryModule {
    @Singleton
    @Provides
    ServiceApi provideService(AppComponent appComponent) {
        return appComponent.getDataRepository().getServiceApi();
    }
}
