package com.lany.itemdecoration.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, LinearLayoutManagerActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, GridLayoutManagerActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, GridLayoutManager1Activity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, GridLayoutManager2Activity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this, LinearLayoutManager2Activity.class));
                break;
            default:
                break;
        }
    }
}
