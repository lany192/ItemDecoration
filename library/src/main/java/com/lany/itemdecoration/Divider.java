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
            this.left = new Border(true, color, 0.5f, 0, 0);
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setLeftWidth(float width) {
            this.left = new Border(true, Color.TRANSPARENT, width, 0, 0);
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
            this.left = new Border(true, color, width, 0, 0);
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
            this.left = new Border(true, color, width, startPadding, endPadding);
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
            this.left = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }

        /**
         * 设置左边的边
         *
         * @param leftBorder 边
         * @return 当前分割线
         */
        public Builder setLeft(Border leftBorder) {
            this.left = leftBorder;
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setTopColor(@ColorInt int color) {
            this.top = new Border(true, color, 0.5f, 0, 0);
            return this;
        }

        /**
         * 设置上边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setTopWidth(float width) {
            this.top = new Border(true, Color.TRANSPARENT, width, 0, 0);
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
            this.top = new Border(true, color, width, 0, 0);
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
            this.top = new Border(true, color, width, startPadding, endPadding);
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
            this.top = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }


        /**
         * 设置上边的边
         *
         * @param topBorder 边
         * @return 当前分割线
         */
        public Builder setTop(Border topBorder) {
            this.top = topBorder;
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setRightColor(@ColorInt int color) {
            this.right = new Border(true, color, 0.5f, 0, 0);
            return this;
        }

        /**
         * 设置右边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setRightWidth(float width) {
            this.right = new Border(true, Color.TRANSPARENT, width, 0, 0);
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
            this.right = new Border(true, color, width, 0, 0);
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
            this.right = new Border(true, color, width, startPadding, endPadding);
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
            this.right = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }


        /**
         * 设置右边的边
         *
         * @param rightBorder 边
         * @return 当前分割线
         */
        public Builder setRight(Border rightBorder) {
            this.right = rightBorder;
            return this;
        }

        /**
         * 设置下边的边
         *
         * @param color 边的颜色
         * @return 当前分割线
         */
        public Builder setBottomColor(@ColorInt int color) {
            this.bottom = new Border(true, color, 0.5f, 0, 0);
            return this;
        }


        /**
         * 设置下边的边
         *
         * @param width 边的宽度
         * @return 当前分割线
         */
        public Builder setBottomWidth(float width) {
            this.bottom = new Border(true, Color.TRANSPARENT, width, 0, 0);
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
            this.bottom = new Border(true, color, width, 0, 0);
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
            this.bottom = new Border(true, color, width, startPadding, endPadding);
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
            this.bottom = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }


        /**
         * 设置下边的边
         *
         * @param bottomBorder 边
         * @return 当前分割线
         */
        public Builder setBottom(Border bottomBorder) {
            this.bottom = bottomBorder;
            return this;
        }

        /**
         * @return 分割线的实例
         */
        public Divider build() {
            //提供一个默认不显示的sideline，防止空指针
            Border defaultBorder = new Border(false, Color.TRANSPARENT, 0, 0, 0);
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



