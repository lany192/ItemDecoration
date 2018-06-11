package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.activity.BaseActivity;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.Divider;
import com.lany.itemdecoration.ItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class GridLayoutManager1Activity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recyclerview;
    }

    @Override
    protected void init(Bundle bundle) {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            items.add("item" + i);
        }
        GridLayoutManager manager = new GridLayoutManager(this, 12);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

            @Override
            public int getSpanSize(int position) {
                if (position == 0 || position == 1) {
                    return 6;
                } else if (position == 6 || position == 10) {
                    return 12;
                } else if (position >= 7 && position <= 9) {
                    return 4;
                } else if (position >= 2 && position <= 5) {
                    return 3;
                }
                return 3;
            }
        });
        recyclerView.setLayoutManager(manager);

        recyclerView.addItemDecoration(new ItemDecoration() {

            @Override
            public Divider getDivider(int itemPosition) {
                Divider divider = null;
                if ((itemPosition >= 1 && itemPosition <= 6) || itemPosition == 9 || itemPosition == 10) {
                    divider = new Divider.Builder()
                            .setBottom(Color.BLACK, 6)
                            .build();
                } else if (itemPosition == 0 || itemPosition == 7 || itemPosition == 8) {
                    divider = new Divider.Builder()
                            .setRight(Color.BLACK, 6)
                            .setBottom(Color.BLACK, 6)
                            .build();
                } else if (itemPosition > 10 && itemPosition < 22) {
                    switch ((itemPosition - 10) % 4) {
                        case 1:
                        case 2:
                        case 3:
                            divider = new Divider.Builder()
                                    .setRight( Color.BLACK, 6)
                                    .setBottom( Color.BLACK, 6)
                                    .build();
                            break;
                        case 0:
                            divider = new Divider.Builder()
                                    .setBottom(Color.BLACK, 6)
                                    .build();
                            break;
                        default:
                            break;
                    }
                }
                return divider;
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
