package com.github.lany192.decoration;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;

import androidx.annotation.ColorInt;

/**
 * 边
 */
public class Border {
    /**
     * 边的颜色
     **/
    @ColorInt
    private int color;
    /**
     * 边的宽度，单位dp
     */
    private int width;
    /**
     * startPadding,分割线起始的padding，水平方向左为start，垂直方向上为start
     */
    private int startPadding;
    /**
     * endPadding,分割线尾部的padding，水平方向右为end，垂直方向下为end
     */
    private int endPadding;

    private Border(builder builder) {
        this.color = builder.color;
        this.width = builder.width;
        this.startPadding = builder.startPadding;
        this.endPadding = builder.endPadding;
    }

    public int getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getStartPadding() {
        return startPadding;
    }

    public int getEndPadding() {
        return endPadding;
    }

    public static class builder {
        /**
         * 边的颜色
         **/
        @ColorInt
        private int color = Color.TRANSPARENT;
        /**
         * 边的宽度，单位dp
         */
        private int width = 1;
        /**
         * startPadding,分割线起始的padding，水平方向左为start，垂直方向上为start
         */
        private int startPadding;
        /**
         * endPadding,分割线尾部的padding，水平方向右为end，垂直方向下为end
         */
        private int endPadding;

        public builder() {

        }

        public builder color(@ColorInt int color) {
            this.color = color;
            return this;
        }

        public builder width(float width) {
            this.width = dp2px(width);
            return this;
        }

        public builder startPadding(float startPadding) {
            this.startPadding = dp2px(startPadding);
            return this;
        }

        public builder endPadding(float endPadding) {
            this.endPadding = dp2px(endPadding);
            return this;
        }

        public Border build() {
            return new Border(this);
        }

        /**
         * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
         */
        private int dp2px(float dpValue) {
            return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, Resources.getSystem().getDisplayMetrics());
        }
    }
}
