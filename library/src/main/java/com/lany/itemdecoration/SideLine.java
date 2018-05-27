package com.lany.itemdecoration;

import android.content.res.Resources;
import android.support.annotation.ColorInt;
import android.util.TypedValue;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SideLine {
    /**
     * 是否存在这个边
     */
    public boolean isExist;
    /**
     * 分割线的颜色
     **/
    @ColorInt
    public int color;
    /**
     * 单位dp
     */
    public float width;
    /**
     * startPadding,分割线起始的padding，水平方向左为start，垂直方向上为start
     * endPadding,分割线尾部的padding，水平方向右为end，垂直方向下为end
     */
    public float startPadding;
    public float endPadding;

    public SideLine(boolean isExist, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
        this.isExist = isExist;
        this.color = color;
        this.width = widthDp;
        this.startPadding = startPaddingDp;
        this.endPadding = endPaddingDp;
    }

    public int getWidth() {
        if (isExist) {
            return dp2px(width);
        } else {
            return 0;
        }
    }

    public int getStartPadding() {
        return dp2px(startPadding);
    }

    public int getEndPadding() {
        return dp2px(endPadding);
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    private int dp2px(float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, Resources.getSystem().getDisplayMetrics());
    }
}
