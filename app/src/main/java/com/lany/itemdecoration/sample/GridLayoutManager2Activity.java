package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.activity.BaseActivity;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.Divider;
import com.lany.itemdecoration.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class GridLayoutManager2Activity extends BaseActivity {
    private RecyclerView recyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recyclerview;
    }

    @Override
    protected void init(Bundle bundle) {
        recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            items.add("item" + i);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple, items) {

            @Override
            protected void convert(ItemViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });

        recyclerView.addItemDecoration(new DividerItemDecoration() {
            @Override
            public Divider getDivider(int itemPosition) {
                if (itemPosition % 2 == 0) {
                    //每一行第一个显示rignt和bottom
                    return new Divider.Builder()
                            .setRight(true, Color.BLACK, 1, 0, 0)
                            .setBottom(true, Color.BLACK, 1, 0, 0)
                            .build();
                } else {
                    //第二个显示Left和bottom
                    return new Divider.Builder()
                            .setLeft(true, Color.BLACK, 1, 0, 0)
                            .setBottom(true, Color.BLACK, 1, 0, 0)
                            .build();
                }
            }
        });
    }

}
