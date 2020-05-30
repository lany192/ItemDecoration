package com.github.lany192.decoration

import android.content.res.Resources
import android.util.TypedValue
import androidx.annotation.ColorInt

/**
 * 边
 */
class Border {
    /**
     * 边的颜色
     */
    @ColorInt
    var color = 0

    /**
     * 边的宽度，单位dp
     */
    var width = 0

    /**
     * startPadding,分割线起始的padding，水平方向左为start，垂直方向上为start
     */
    var startPadding = 0

    /**
     * endPadding,分割线尾部的padding，水平方向右为end，垂直方向下为end
     */
    var endPadding = 0

    constructor() {}
    constructor(
        color: Int,
        width: Float
    ) {
        this.color = color
        this.width = dp2px(width)
    }

    constructor(
        color: Int,
        width: Float,
        startPadding: Float,
        endPadding: Float
    ) {
        this.color = color
        this.width = dp2px(width)
        this.startPadding = dp2px(startPadding)
        this.endPadding = dp2px(endPadding)
    }

    fun setColor(color: Int): Border {
        this.color = color
        return this
    }

    fun setWidth(width: Float): Border {
        this.width = dp2px(width)
        return this
    }

    fun setStartPadding(startPadding: Float): Border {
        this.startPadding = dp2px(startPadding)
        return this
    }

    fun setEndPadding(endPadding: Float): Border {
        this.endPadding = dp2px(endPadding)
        return this
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    private fun dp2px(dpValue: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpValue,
            Resources.getSystem().displayMetrics
        ).toInt()
    }
}