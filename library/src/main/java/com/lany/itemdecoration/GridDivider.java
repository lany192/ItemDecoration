package com.lany.itemdecoration;

import android.support.annotation.ColorInt;
import android.support.v7.widget.GridLayoutManager;

public class GridDivider extends DividerItemDecoration {
    private int spanCount;
    private int width = 2;
    /**
     * 默认透明色
     */
    @ColorInt
    private int color = 0x00000000;

    public GridDivider() {

    }

    public GridDivider(int spanCount, int width, int color) {
        this.spanCount = spanCount;
        if (spanCount < 2) {
            throw new RuntimeException("spanCount min value is 2");
        }
        this.width = width;
        this.color = color;
    }

    public GridDivider(GridLayoutManager manager) {
        this.spanCount = manager.getSpanCount();
        if (spanCount < 2) {
            throw new RuntimeException("spanCount min value is 2");
        }
    }

    public GridDivider setSpanCount(int spanCount) {
        this.spanCount = spanCount;
        return this;
    }

    public GridDivider setWidth(int width) {
        this.width = width;
        return this;
    }

    public GridDivider setColor(@ColorInt int color) {
        this.color = color;
        return this;
    }

    @Override
    public Divider getDivider(int itemPosition) {
        int remainder = itemPosition % spanCount;
        if (remainder == spanCount - 1) {
            //最后一个只显示bottom
            return new Divider.Builder()
                    .setBottom(true, color, width, 0, 0)
                    .build();
        } else {
            return new Divider.Builder()
                    .setRight(true, color, width, 0, 0)
                    .setBottom(true, color, width, 0, 0)
                    .build();
        }
    }
}