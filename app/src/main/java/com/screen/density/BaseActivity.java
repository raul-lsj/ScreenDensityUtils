package com.screen.density;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.screen.density.utils.Density;

import butterknife.ButterKnife;

/**
 * Created by Raul_lsj on 2018/3/9.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;
    protected Activity mActivity;
    protected Context appContext;
    protected Application mApplication;

    protected static Toast toast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mActivity = this;
        appContext = getApplicationContext();
        mApplication = getApplication();
        setOrientation();
        setContentView(getLayout());
        ButterKnife.bind(this);
        initEvent();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void showMsg(String msg) {
        toast = Toast.makeText(appContext, "", Toast.LENGTH_SHORT);
        toast.setText(msg);
        toast.show();
    }

    //获取请求失败得到的code,并针对处理
    public void showMistake(int code, String msg) {
        showMsg(msg);
        switch (code) {
            case 100:

                break;
            default:
                break;
        }
    }


    public void setOrientation() {
        Density.setDefault(mActivity);
    }

    protected abstract int getLayout();

    protected abstract void initEvent();
}
