package com.wxz.draggerdemo;

import androidx.core.app.NavUtils;

public interface BasePresenter<T> {

    /**
     * Binds presenter with a view when resumed.The presenter will perform initialization here.
     * @param view the view associated with the presenter
     * */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed.
     * */
    void dropView();
}
