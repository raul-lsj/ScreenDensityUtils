package com.screen.density;

import com.screen.density.utils.AppUtils;
import com.screen.density.utils.Density;

public class MainActivity extends BaseActivity {

    @Override
    public void setOrientation() {
        Density.setOrientation(mActivity, AppUtils.HEIGHT);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEvent() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_frag, new MainFragment())
                .commit();
    }
}
