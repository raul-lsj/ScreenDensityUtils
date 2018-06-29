package com.screen.density;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Raul_lsj on 2018/3/9.
 */

public abstract class BaseFragment extends Fragment {

    protected View view;
    protected LayoutInflater inflater;
    private Unbinder unBinder;

    protected Activity mActivity;
    protected Context mContext;
    protected Context appContext;
    protected Application mApplication;

    private static Toast toast;

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        appContext = mActivity.getApplicationContext();
        mApplication = mActivity.getApplication();
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(getLayout(), container, false);
        //指出fragment愿意添加item到选项菜单
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inflater = onGetLayoutInflater(savedInstanceState);
        unBinder = ButterKnife.bind(this, view);
        initEvent();
    }

    @Override
    public void onDestroyView() {
        unBinder.unbind();
        super.onDestroyView();
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

    protected abstract int getLayout();

    protected abstract void initEvent();
}
