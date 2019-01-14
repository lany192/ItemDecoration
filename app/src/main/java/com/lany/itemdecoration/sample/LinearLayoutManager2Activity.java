package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.LinearItemDecoration;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LinearLayoutManager2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_manager2);
//
//        RecyclerView recyclerView = findViewById(R.id.recyclerview);
//        List<String> items = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            items.add("item" + i);
//        }
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(manager);
//        recyclerView.addItemDecoration(new LinearItemDecoration(LinearLayoutManager.HORIZONTAL)
//                .setColor(Color.RED)
//                .setWidth(4));
//        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple_horizontal, items) {
//
//            @Override
//            protected void convert(ItemViewHolder helper, String item) {
//                helper.setText(R.id.textView, item);
//            }
//        });
    }
}
