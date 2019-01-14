package com.lany.itemdecoration;


import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 适用于LinearLayoutManager
 */
public class LinearItemDecoration extends ItemDecoration {
    /**
     * 分割线宽度，默认是1dp
     */
    private int width = 1;
    /**
     * 默认透明色
     */
    @ColorInt
    private int color = 0x00000000;
    /**
     * 方向，默认是纵向
     */
    @RecyclerView.Orientation
    private int orientation;

    /**
     * 分割线padding
     */
    private int padding;


    public LinearItemDecoration() {
        orientation = RecyclerView.VERTICAL;
    }

    public LinearItemDecoration(@RecyclerView.Orientation int orientation) {
        this.orientation = orientation;
    }

    public LinearItemDecoration(int width, @ColorInt int color, @RecyclerView.Orientation int orientation) {
        this.width = width;
        this.color = color;
        this.orientation = orientation;
    }

    public LinearItemDecoration(int width, @ColorInt int color) {
        this.width = width;
        this.color = color;
        this.orientation = RecyclerView.VERTICAL;
    }

    public LinearItemDecoration setWidth(int width) {
        this.width = width;
        return this;
    }

    public LinearItemDecoration setPadding(int padding) {
        this.padding = padding;
        return this;
    }

    public LinearItemDecoration setColor(@ColorInt int color) {
        this.color = color;
        return this;
    }

    public LinearItemDecoration setOrientation(@RecyclerView.Orientation int orientation) {
        this.orientation = orientation;
        return this;
    }

    @Override
    public Divider getDivider(int itemPosition) {
        if (orientation != RecyclerView.HORIZONTAL && orientation != RecyclerView.VERTICAL) {
            throw new IllegalArgumentException("invalid orientation:" + orientation);
        }
        Border border = Border.builder()
                .color(color)
                .width(width)
                .startPadding(padding)
                .endPadding(padding)
                .build();
        if (orientation != RecyclerView.VERTICAL) {
            return new Divider
                    .Builder()
                    .setRight(border)
                    .build();
        } else {
            return new Divider
                    .Builder()
                    .setBottom(border)
                    .build();
        }
    }
}