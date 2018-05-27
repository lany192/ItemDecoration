package com.lany.itemdecoration.sample;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.activity.BaseActivity;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.Divider;
import com.lany.itemdecoration.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManagerActivity extends BaseActivity {
    private RecyclerView recyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recyclerview;
    }

    @Override
    protected void init(Bundle bundle) {
        recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration() {

            @Override
            public Divider getDivider(int itemPosition) {
                switch (itemPosition) {
                    case 0:
                        return new Divider.Builder()
                                .setBottom(true, 0xff228B22, 2, 0, 0)
                                .build();
                    case 1:
                        return new Divider.Builder()
                                .setBottom(true, 0xff666666, 2, 0, 0)
                                .build();
                    case 2:
                        return new Divider.Builder()
                                .setBottom(true, 0xff228B22, 4, 0, 0)
                                .build();
                    case 3:
                        return new Divider.Builder()
                                .setBottom(true, 0xff228B22, 2, 16, 16)
                                .build();
                    case 4:
                        return new Divider.Builder()
                                .setBottom(true, 0xff228B22, 2, 16, 32)
                                .build();
                    case 5:
                        return new Divider.Builder()
                                .setBottom(true, 0xff228B22, 2, 0, 0)
                                .build();
                    case 6:
                        return new Divider.Builder()
                                .setLeft(true, 0xff228B22, 3, 0, 0)
                                .setRight(true, 0xff228B22, 8, 0, 0)
                                .setBottom(true, 0xff228B22, 6, 0, 0)
                                .build();
                    default:
                        return new Divider.Builder()
                                .setBottom(true, 0xff666666, 2, 0, 0)
                                .build();
                }
            }
        });
        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple, items) {

            @Override
            protected void convert(ItemViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });
    }
}
