package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.Divider;
import com.lany.itemdecoration.ItemDecoration;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LinearLayoutManagerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
//        recyclerView = findViewById(R.id.recyclerview);
//        List<String> items = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            items.add("item" + i);
//        }
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.addItemDecoration(new ItemDecoration() {
//
//            @Override
//            public Divider getDivider(int itemPosition) {
//                switch (itemPosition) {
//                    case 0:
//                        return new Divider.Builder()
//                                .setBottom(Color.YELLOW, 2)
//                                .build();
//                    case 1:
//                        return new Divider.Builder()
//                                .setBottom(Color.BLACK, 2)
//                                .build();
//                    case 2:
//                        return new Divider.Builder()
//                                .setBottom(Color.RED, 4)
//                                .build();
//                    case 3:
//                        return new Divider.Builder()
//                                .setBottom(Color.RED, 4, 16, 16)
//                                .build();
//                    case 4:
//                        return new Divider.Builder()
//                                .setBottom(Color.RED, 2, 16, 32)
//                                .build();
//                    case 5:
//                        return new Divider.Builder()
//                                .setBottom(Color.RED, 2)
//                                .build();
//                    case 6:
//                        return new Divider.Builder()
//                                .setLeft(Color.RED, 3)
//                                .setRight(Color.RED, 8)
//                                .setBottom(Color.RED, 6)
//                                .build();
//                    default:
//                        return super.getDivider(itemPosition);
//                }
//            }
//        });
//        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple, items) {
//
//            @Override
//            protected void convert(ItemViewHolder helper, String item) {
//                helper.setText(R.id.textView, item);
//            }
//        });
    }
}
