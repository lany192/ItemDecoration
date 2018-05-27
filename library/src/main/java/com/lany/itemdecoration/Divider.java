package com.lany.itemdecoration;

import android.graphics.Color;
import android.support.annotation.ColorInt;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Divider {
    private Border left;
    private Border top;
    private Border right;
    private Border bottom;

    private Divider(Border left, Border top, Border right, Border bottom) {
        super();
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public static class Builder {
        private Border left;
        private Border top;
        private Border right;
        private Border bottom;

        public Builder setLeft(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.left = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }

        public Builder setTop(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.top = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }

        public Builder setRight(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.right = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }

        public Builder setBottom(boolean isHave, @ColorInt int color, float width, float startPadding, float endPadding) {
            this.bottom = new Border(isHave, color, width, startPadding, endPadding);
            return this;
        }

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



