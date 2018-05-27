package com.lany.itemdecoration.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lany.box.activity.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean hasBackBtn() {
        return false;
    }

    @Override
    protected void init(Bundle bundle) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(self, LinearLayoutManagerActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(self, GridLayoutManagerActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(self, GridLayoutManager1Activity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(self, GridLayoutManager2Activity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(self, LinearLayoutManager2Activity.class));
                break;
            default:
                break;
        }

    }
}
