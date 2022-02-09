package com.github.lany192.decoration.sample;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.github.lany192.decoration.Divider;
import com.github.lany192.decoration.ItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManagerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new ItemDecoration() {

            @Override
            public Divider getDivider(int itemPosition) {
                switch (itemPosition) {
                    case 0:
                        return new Divider()
                                .setBottom(Color.YELLOW, 2)
                                ;
                    case 1:
                        return new Divider()
                                .setBottom(Color.BLACK, 2)
                                ;
                    case 2:
                        return new Divider()
                                .setBottom(Color.RED, 4)
                                ;
                    case 3:
                        return new Divider()
                                .setBottom(Color.RED, 4, 16, 16)
                                ;
                    case 4:
                        return new Divider()
                                .setBottom(Color.RED, 2, 16, 32)
                                ;
                    case 5:
                        return new Divider()
                                .setBottom(Color.RED, 2)
                                ;
                    case 6:
                        return new Divider()
                                .setLeft(Color.RED, 3)
                                .setRight(Color.RED, 8)
                                .setBottom(Color.RED, 6)
                                ;
                    default:
                        return super.getDivider(itemPosition);
                }
            }
        });
        recyclerView.setAdapter(new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_simple, items) {

            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });
    }
}
