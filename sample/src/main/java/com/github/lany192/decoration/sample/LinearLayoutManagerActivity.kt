package com.github.lany192.decoration.sample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.github.lany192.decoration.Divider
import com.github.lany192.decoration.ItemDecoration

class LinearLayoutManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val items: MutableList<String> = ArrayList()
        for (i in 0..99) {
            items.add("item$i")
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(object : ItemDecoration() {

            override fun getDivider(position: Int): Divider? {
                return when (position) {
                    0 -> Divider.Builder().setBottom(Color.YELLOW, 2f).build()
                    1 -> Divider.Builder().setBottom(Color.BLACK, 2f).build()
                    2 -> Divider.Builder().setBottom(Color.RED, 4f).build()
                    3 -> Divider.Builder().setBottom(Color.RED, 4f, 16f, 16f).build()
                    4 -> Divider.Builder().setBottom(Color.RED, 2f, 16f, 32f).build()
                    5 -> Divider.Builder().setBottom(Color.RED, 2f).build()
                    6 -> Divider.Builder().setLeft(Color.RED, 3f)
                        .setRight(Color.RED, 8f)
                        .setBottom(Color.RED, 6f).build()
                    else -> super.getDivider(position)
                }
            }
        })
        recyclerView.adapter =
            object : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_simple, items) {
                override fun convert(holder: BaseViewHolder, item: String) {
                    holder.setText(R.id.textView, item)
                }
            }
    }
}