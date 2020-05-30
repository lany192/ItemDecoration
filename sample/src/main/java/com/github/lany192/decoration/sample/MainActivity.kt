package com.github.lany192.decoration.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> startActivity(Intent(this, LinearLayoutManagerActivity::class.java))
            R.id.button2 -> startActivity(Intent(this, GridLayoutManagerActivity::class.java))
            R.id.button3 -> startActivity(Intent(this, GridLayoutManager1Activity::class.java))
            R.id.button4 -> startActivity(Intent(this, GridLayoutManager2Activity::class.java))
            R.id.button5 -> startActivity(Intent(this, LinearLayoutManager2Activity::class.java))
        }
    }
}