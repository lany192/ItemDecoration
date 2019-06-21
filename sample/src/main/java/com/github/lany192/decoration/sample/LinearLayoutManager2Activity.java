package com.github.lany192.decoration.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.lany192.decoration.LinearDecoration;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManager2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_manager2);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new LinearDecoration(LinearLayoutManager.HORIZONTAL)
                .setColor(Color.RED)
                .setWidth(4));
        recyclerView.setAdapter(new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_simple_horizontal, items) {

            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.textView, item);
            }
        });
    }
}
