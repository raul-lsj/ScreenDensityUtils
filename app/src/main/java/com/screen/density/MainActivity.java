package com.screen.density;

public class MainActivity extends BaseActivity {

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
