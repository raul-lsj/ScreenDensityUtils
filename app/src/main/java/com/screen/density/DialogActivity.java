package com.screen.density;

import android.view.LayoutInflater;
import android.view.View;

import com.qmuiteam.qmui.widget.popup.QMUIPopup;
import com.screen.density.utils.AppUtils;

import butterknife.OnClick;

public class DialogActivity extends BaseActivity {

    private QMUIPopup popup;

    @Override
    protected int getLayout() {
        return R.layout.activity_dialog;
    }

    @Override
    protected void initEvent() {

    }

    @OnClick({R.id.qmui_popup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.qmui_popup:
                //注册PopupWindow
                if (popup == null) {
                    popup = new QMUIPopup(mContext, QMUIPopup.DIRECTION_NONE);
                }
                Qmui_Popup();
                //动画效果
                popup.setAnimStyle(QMUIPopup.ANIM_GROW_FROM_CENTER);
                //pop在按钮的什么位置弹出(TOP/BOTTOM)
                popup.setPreferredDirection(QMUIPopup.DIRECTION_BOTTOM);
                popup.show(view);
                break;
        }
    }

    private void Qmui_Popup() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.popup_qmui, null);
        //动态设置view的宽高
        view.setLayoutParams(popup.generateLayoutParam(
                AppUtils.dpToPx(mContext, 200), AppUtils.dpToPx(mContext, 200)));
        //设置pop布局
        popup.setContentView(view);
    }
}
