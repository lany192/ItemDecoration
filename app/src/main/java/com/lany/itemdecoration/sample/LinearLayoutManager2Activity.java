package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.activity.BaseActivity;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.LinearItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManager2Activity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_linear_layout_manager2;
    }

    @Override
    protected void init(Bundle bundle) {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new LinearItemDecoration(LinearLayoutManager.HORIZONTAL)
                .setColor(Color.RED)
                .setWidth(4));
        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple_horizontal, items) {

            @Override
            protected void convert(ItemViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });
    }
}
