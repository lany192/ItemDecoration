package com.lany.itemdecoration;

import android.support.annotation.ColorInt;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Divider {
    private SideLine left;
    private SideLine top;
    private SideLine right;
    private SideLine bottom;

    private Divider(SideLine left, SideLine top, SideLine right, SideLine bottom) {
        super();
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public static class Builder {
        private SideLine left;
        private SideLine top;
        private SideLine right;
        private SideLine bottom;

        public Builder setLeft(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
            this.left = new SideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
            return this;
        }

        public Builder setTop(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
            this.top = new SideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
            return this;
        }

        public Builder setRight(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
            this.right = new SideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
            return this;
        }

        public Builder setBottom(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
            this.bottom = new SideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
            return this;
        }

        public Divider build() {
            //提供一个默认不显示的sideline，防止空指针
            SideLine defaultSideLine = new SideLine(false, 0x00000000, 0, 0, 0);
            if (left == null) {
                left = defaultSideLine;
            }
            if (top == null) {
                top = defaultSideLine;
            }
            if (right == null) {
                right = defaultSideLine;
            }
            if (bottom == null) {
                bottom = defaultSideLine;
            }
            return new Divider(left, top, right, bottom);
        }
    }
}



