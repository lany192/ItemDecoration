package com.lany.itemdecoration.sample;

import android.app.Application;

import com.lany.box.Box;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Box.of().init(this);
    }
}
