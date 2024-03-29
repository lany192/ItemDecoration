package com.github.lany192.decoration;

import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.GridLayoutManager;

/**
 * 适用于GridLayoutManager
 */
public class GridDecoration extends ItemDecoration {
    private int spanCount;
    private int width = 1;
    /**
     * 默认透明色
     */
    @ColorInt
    private int color;

    /**
     * 是否显示四周的边
     */
    private boolean isShowBorder = false;

    public GridDecoration() {

    }

    public GridDecoration(int spanCount, int width, int color) {
        this.spanCount = spanCount;
        checkSpanCount(spanCount);
        this.width = width;
        this.color = color;
    }

    public GridDecoration(GridLayoutManager manager) {
        this.spanCount = manager.getSpanCount();
        checkSpanCount(spanCount);
    }

    public GridDecoration setSpanCount(int spanCount) {
        this.spanCount = spanCount;
        checkSpanCount(spanCount);
        return this;
    }

    public GridDecoration setWidth(int width) {
        this.width = width;
        return this;
    }

    public GridDecoration setColor(@ColorInt int color) {
        this.color = color;
        return this;
    }

    public GridDecoration setShowBorder(boolean isShowBorder) {
        this.isShowBorder = isShowBorder;
        return this;
    }

    @Override
    public Divider getDivider(int position) {
        checkSpanCount(spanCount);
        int remainder = position % spanCount;
        Border border = new Border.builder()
                .color(color)
                .width(width)
                .build();
        if (isShowBorder) {//要显示四周的边
            if (remainder == 0) {
                if (position < spanCount) {
                    return new Divider
                            .Builder()
                            .setTop(border)
                            .setLeft(border)
                            .setRight(border)
                            .setBottom(border)
                            .build();
                } else {
                    return new Divider
                            .Builder()
                            .setLeft(border)
                            .setRight(border)
                            .setBottom(border)
                            .build();
                }
            } else {
                if (position < spanCount) {
                    return new Divider
                            .Builder()
                            .setTop(border)
                            .setRight(border)
                            .setBottom(border)
                            .build();
                } else {
                    return new Divider
                            .Builder()
                            .setRight(border)
                            .setBottom(border)
                            .build();
                }
            }
        } else {
            if (remainder == spanCount - 1) {
                //最后一个只显示bottom
                return new Divider
                        .Builder()
                        .setBottom(border)
                        .build();
            } else {
                return new Divider
                        .Builder()
                        .setRight(border)
                        .setBottom(border)
                        .build();
            }
        }
    }

    private void checkSpanCount(int spanCount) {
        if (spanCount < 2) {
            throw new RuntimeException("SpanCount minimum is 2");
        }
    }
}