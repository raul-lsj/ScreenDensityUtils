package com.screen.density;

import android.content.Intent;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Raul_lsj on 2018/6/29.
 */

public class MainFragment extends BaseFragment {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private MainAdapter mAdapter;
    private List<String> list;

    @Override
    protected int getLayout() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initEvent() {
        initdata();
        initList();
    }

    private void initdata() {
        list = new ArrayList<>();
        list.add("dialog");
        list.add("TextView");
        list.add("h-45dp-------" + 1);
        list.add("h-45dp-------" + 2);
        list.add("h-45dp-------" + 3);
        list.add("h-45dp-------" + 4);
        list.add("h-45dp-------" + 5);
        list.add("h-45dp-------" + 6);
        list.add("h-45dp-------" + 7);
        list.add("h-45dp-------" + 8);
        list.add("h-45dp-------" + 9);
        list.add("h-45dp-------" + 10);
        list.add("h-45dp-------" + 11);
        list.add("h-45dp-------" + 12);
        list.add("h-45dp-------" + 13);
        list.add("h-45dp-------" + 14);
        list.add("h-45dp-------" + 15);
        list.add("h-45dp-------" + 16);
        list.add("h-45dp-------" + 17);
        list.add("h-45dp-------" + 18);
        list.add("h-45dp-------" + 19);
        list.add("h-45dp-------" + 20);
        list.add("h-45dp-------" + 21);
        list.add("h-45dp-------" + 22);
        list.add("h-45dp-------" + 23);
        list.add("h-45dp-------" + 24);
        list.add("h-45dp-------" + 25);
        list.add("h-45dp-------" + 26);
        list.add("h-45dp-------" + 27);
        list.add("h-45dp-------" + 28);
        list.add("h-45dp-------" + 29);
        list.add("h-45dp-------" + 30);
    }

    private void initList() {
        if (mAdapter == null) {
            mAdapter = new MainAdapter(R.layout.item_main, null);
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
            recyclerView.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
            recyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(mContext, DialogActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(mContext, TextViewActivity.class));
                        break;
                }
            }
        });

        if (list != null) {
            mAdapter.setNewData(list);
        }
    }
}
