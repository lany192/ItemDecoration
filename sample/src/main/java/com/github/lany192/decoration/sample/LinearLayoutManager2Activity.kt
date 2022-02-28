package com.github.lany192.decoration.sample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.github.lany192.decoration.LinearDecoration

class LinearLayoutManager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout_manager2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val items: MutableList<String> = ArrayList()
        for (i in 0..99) {
            items.add("item$i")
        }
        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = manager
        recyclerView.addItemDecoration(
            LinearDecoration(LinearLayoutManager.HORIZONTAL)
                .setColor(Color.RED)
                .setWidth(4)
        )
        recyclerView.adapter = object : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_simple_horizontal, items) {

            override fun convert(holder: BaseViewHolder, item: String) {
                holder.setText(R.id.textView, item)
            }
        }
    }
}