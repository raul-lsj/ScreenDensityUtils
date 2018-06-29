package com.screen.density;

import android.app.Application;

import com.screen.density.utils.Density;

/**
 * Created by Raul_lsj on 2018/6/29.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Density.setDensity(this);
    }
}
