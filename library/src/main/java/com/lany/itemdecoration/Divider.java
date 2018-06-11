package com.lany.itemdecoration;

import android.graphics.Color;
import android.support.annotation.ColorInt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * 分割线
 */
@Setter
@Getter
@AllArgsConstructor
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
            this.left = Border.builder().isExist(true).color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setLeftWidth(float width) {
            this.left = Border.builder().isExist(true).color(Color.TRANSPARENT).width(width).build();
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
            this.left = Border.builder().isExist(true).color(color).width(width).build();
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
            this.left = Border.builder().isExist(true).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.left = Border.builder().isExist(isHave).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.top = Border.builder().isExist(true).color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setTopWidth(float width) {
            this.top = Border.builder().isExist(true).color(Color.TRANSPARENT).width(width).build();
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
            this.top = Border.builder().isExist(true).color(color).width(width).build();
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
            this.top = Border.builder().isExist(true).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.top = Border.builder().isExist(isHave).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.right = Border.builder().isExist(true).color(color).width(0.5f).build();
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setRightWidth(float width) {
            this.right = Border.builder().isExist(true).color(Color.TRANSPARENT).width(width).build();
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
            this.right = Border.builder().isExist(true).color(color).width(width).build();
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
            this.right = Border.builder().isExist(true).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.right = Border.builder().isExist(isHave).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.bottom = Border.builder().isExist(true).color(color).width(0.5f).build();
            return this;
        }


        /**
         * 设置下边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setBottomWidth(float width) {
            this.bottom = Border.builder().isExist(true).color(Color.TRANSPARENT).width(width).build();
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
            this.bottom = Border.builder().isExist(true).color(color).width(width).build();
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
            this.bottom = Border.builder().isExist(true).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            this.bottom = Border.builder().isExist(isHave).color(color).width(width).startPadding(startPadding).endPadding(endPadding).build();
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
            //提供一个默认不显示的sideline，防止空指针
            Border defaultBorder = Border.builder().color(Color.TRANSPARENT).build();
            if (left == null) {
                left = defaultBorder;
            }
            if (top == null) {
                top = defaultBorder;
            }
            if (right == null) {
                right = defaultBorder;
            }
            if (bottom == null) {
                bottom = defaultBorder;
            }
            return new Divider(left, top, right, bottom);
        }
    }
}



