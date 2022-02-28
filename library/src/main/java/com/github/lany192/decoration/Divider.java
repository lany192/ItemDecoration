package com.github.lany192.decoration;

import android.graphics.Color;

import androidx.annotation.ColorInt;


/**
 * 分割线
 */
public class Divider {
    /**
     * 左边
     */
    private Border left;
    /**
     * 上边
     */
    private Border top;
    /**
     * 右边
     */
    private Border right;
    /**
     * 下边
     */
    private Border bottom;

    public Divider() {

    }
    public Divider(Border left, Border top, Border right, Border bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public Border getLeft() {
        return left;
    }

    public Border getTop() {
        return top;
    }

    public Border getRight() {
        return right;
    }

    public Border getBottom() {
        return bottom;
    }

    public static class Builder {
        private Border left;
        private Border top;
        private Border right;
        private Border bottom;

        /**
         * 设置左边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setLeftColor(@ColorInt int color) {
            this.left = new Border.builder().color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setLeftWidth(float width) {
            this.left = new Border.builder().color(Color.TRANSPARENT).width(width).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param color 边的颜色
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setLeft(@ColorInt int color, float width) {
            this.left = new Border.builder().color(color).width(width).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setLeft(@ColorInt int color, float width, float startPadding, float endPadding) {
            this.left = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param isHave       是否存在这个边
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setLeft(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.left = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param border 边
         * @return 当前分割线
         */
        public Builder setLeft(Border border) {
            this.left = border;
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setTopColor(@ColorInt int color) {
            this.top = new Border.builder().color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setTopWidth(float width) {
            this.top = new Border.builder().color(Color.TRANSPARENT).width(width).build();
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param color 边的颜色
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setTop(@ColorInt int color, float width) {
            this.top = new Border.builder().color(color).width(width).build();
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setTop(@ColorInt int color, float width, float startPadding, float endPadding) {
            this.top = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param isHave       是否存在这个边
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setTop(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.top = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }


        /**
         * 设置上边的边
         *
         * @param border 边
         * @return 当前分割线
         */
        public Builder setTop(Border border) {
            this.top = border;
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setRightColor(@ColorInt int color) {
            this.right = new Border.builder().color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setRightWidth(float width) {
            this.right = new Border.builder().color(Color.TRANSPARENT).width(width).build();
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param color 边的颜色
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setRight(@ColorInt int color, float width) {
            this.right = new Border.builder().color(color).width(width).build();
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setRight(@ColorInt int color, float width, float startPadding, float endPadding) {
            this.right = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param isHave       是否存在这个边
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setRight(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.right = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }


        /**
         * 设置右边的边
         *
         * @param border 边
         * @return 当前分割线
         */
        public Builder setRight(Border border) {
            this.right = border;
            return this;
        }

        /**
         * 设置下边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setBottomColor(@ColorInt int color) {
            this.bottom = new Border.builder().color(color).width(0.5f).build();
            return this;
        }


        /**
         * 设置下边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setBottomWidth(float width) {
            this.bottom = new Border.builder().color(Color.TRANSPARENT).width(width).build();
            return this;
        }

        /**
         * 设置下边的边
         *
         * @param color 边的颜色
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setBottom(@ColorInt int color, float width) {
            this.bottom = new Border.builder().color(color).width(width).build();
            return this;
        }

        /**
         * 设置下边的边
         *
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setBottom(@ColorInt int color, float width, float startPadding, float endPadding) {
            this.bottom = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }

        /**
         * 设置下边的边
         *
         * @param isHave       是否存在这个边
         * @param color        边的颜色
         * @param width        边的宽度
         * @param startPadding 起始padding的大小
         * @param endPadding   结束padding的大小
         * @return 当前分割线
         */
        public Builder setBottom(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.bottom = new Border.builder().color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
            return this;
        }


        /**
         * 设置下边的边
         *
         * @param border 边
         * @return 当前分割线
         */
        public Builder setBottom(Border border) {
            this.bottom = border;
            return this;
        }

        /**
         * @return 分割线的实例
         */
        public Divider build() {
            return new Divider(left, top, right, bottom);
        }
    }
}



