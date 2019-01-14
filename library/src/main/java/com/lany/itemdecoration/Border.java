package com.lany.itemdecoration;

import android.content.res.Resources;
import android.util.TypedValue;

import androidx.annotation.ColorInt;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 边
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Border {
    /**
     * 边的颜色
     **/
    @ColorInt
    public int color;
    /**
     * 边的宽度，单位dp
     */
    public float width;
    /**
     * startPadding,分割线起始的padding，水平方向左为start，垂直方向上为start
     */
    public float startPadding;
    /**
     * endPadding,分割线尾部的padding，水平方向右为end，垂直方向下为end
     */
    public float endPadding;

    public int getWidth() {
        return dp2px(width);
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
