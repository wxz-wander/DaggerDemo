package com.wxz.draggerdemo;

public interface SplashContact {
    interface View extends BaseView<Presenter> {
        void showErrorDialog();

        void goMain();
    }

    interface Presenter extends BasePresenter<View> {
        @Override
        void takeView(SplashContact.View view);

        @Override
        void dropView();

        void loadConfig();
    }
}
