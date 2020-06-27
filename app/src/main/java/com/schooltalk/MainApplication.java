package com.schooltalk;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by gaoteng on 2020/6/27.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
