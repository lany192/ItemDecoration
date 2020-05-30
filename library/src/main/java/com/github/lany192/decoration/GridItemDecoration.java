package com.github.lany192.decoration;


import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.GridLayoutManager;

/**
 * 适用于GridLayoutManager
 */
public class GridItemDecoration extends ItemDecoration {
    private int spanCount;
    private int width = 1;
    /**
     * 默认透明色
     */
    @ColorInt
    private int color = 0x00000000;

    /**
     * 是否显示四周的边
     */
    private boolean isShowBorder = false;

    public GridItemDecoration() {

    }

    public GridItemDecoration(int spanCount, int width, int color) {
        this.spanCount = spanCount;
        checkSpanCount(spanCount);
        this.width = width;
        this.color = color;
    }

    public GridItemDecoration(GridLayoutManager manager) {
        this.spanCount = manager.getSpanCount();
        checkSpanCount(spanCount);
    }

    public GridItemDecoration setSpanCount(int spanCount) {
        this.spanCount = spanCount;
        checkSpanCount(spanCount);
        return this;
    }

    public GridItemDecoration setWidth(int width) {
        this.width = width;
        return this;
    }

    public GridItemDecoration setColor(@ColorInt int color) {
        this.color = color;
        return this;
    }

    public GridItemDecoration setShowBorder(boolean isShowBorder) {
        this.isShowBorder = isShowBorder;
        return this;
    }

    @Override
    public Divider getDivider(int position) {
        checkSpanCount(spanCount);
        int remainder = position % spanCount;
        Border border = new Border(color, width);
        if (isShowBorder) {//要显示四周的边
            if (remainder == 0) {
                if (position < spanCount) {
                    return new Divider()
                            .setTop(border)
                            .setLeft(border)
                            .setRight(border)
                            .setBottom(border);
                } else {
                    return new Divider()
                            .setLeft(border)
                            .setRight(border)
                            .setBottom(border);
                }
            } else {
                if (position < spanCount) {
                    return new Divider().setTop(border)
                            .setRight(border)
                            .setBottom(border);
                } else {
                    return new Divider().setRight(border).setBottom(border);
                }
            }
        } else {
            if (remainder == spanCount - 1) {
                //最后一个只显示bottom
                return new Divider().setBottom(border);
            } else {
                return new Divider().setRight(border).setBottom(border);
            }
        }
    }

    private void checkSpanCount(int spanCount) {
        if (spanCount < 2) {
            throw new RuntimeException("SpanCount minimum is 2");
        }
    }
}