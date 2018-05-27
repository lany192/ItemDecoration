package com.lany.itemdecoration.sample;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.activity.BaseActivity;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.GridDivider;

import java.util.ArrayList;
import java.util.List;

public class GridLayoutManagerActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recyclerview;
    }

    @Override
    protected void init(Bundle bundle) {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            items.add("item " + i);
        }
        GridLayoutManager manager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple, items) {

            @Override
            protected void convert(ItemViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });
        recyclerView.addItemDecoration(new GridDivider(manager));
    }
}
