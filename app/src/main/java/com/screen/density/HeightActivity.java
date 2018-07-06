package com.screen.density;

import com.screen.density.utils.AppUtils;
import com.screen.density.utils.Density;

/**
 * Created by Raul_lsj on 2018/7/6.
 */

public class HeightActivity extends BaseActivity {

    @Override
    public void setOrientation() {
        Density.setOrientation(mActivity, AppUtils.HEIGHT);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_height;
    }

    @Override
    protected void initEvent() {

    }
}
