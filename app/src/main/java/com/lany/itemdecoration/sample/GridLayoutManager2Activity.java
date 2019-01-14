package com.lany.itemdecoration.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lany.box.adapter.ItemViewHolder;
import com.lany.itemdecoration.GridItemDecoration;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager2Activity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
//        RecyclerView recyclerView = findViewById(R.id.recyclerview);
//        List<String> items = new ArrayList<>();
//        for (int i = 0; i < 77; i++) {
//            items.add("item" + i);
//        }
//        GridLayoutManager manager = new GridLayoutManager(this, 4);
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(new BaseQuickAdapter<String, ItemViewHolder>(R.layout.item_simple, items) {
//
//            @Override
//            protected void convert(ItemViewHolder helper, String item) {
//                helper.setText(R.id.textView, item);
//            }
//        });
//        recyclerView.addItemDecoration(new GridItemDecoration(manager).setShowBorder(true).setColor(Color.RED).setWidth(2));
    }

}
