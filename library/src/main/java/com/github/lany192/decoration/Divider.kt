package com.github.lany192.decoration

import android.graphics.Color
import androidx.annotation.ColorInt

/**
 * 分割线
 */
class Divider {
    /**
     * 左边
     */
    var left: Border? = null
        private set

    /**
     * 上边
     */
    var top: Border? = null
        private set

    /**
     * 右边
     */
    var right: Border? = null
        private set

    /**
     * 下边
     */
    var bottom: Border? = null
        private set

    constructor() {}
    constructor(
        left: Border?,
        top: Border?,
        right: Border?,
        bottom: Border?
    ) {
        this.left = left
        this.top = top
        this.right = right
        this.bottom = bottom
    }

    /**
     * 设置左边的边
     *
     * @param color 边的颜色
     * @return 当前分割线
     */
    fun setLeftColor(@ColorInt color: Int): Divider {
        left = Border(color, 0.5f)
        return this
    }

    /**
     * 设置左边的边
     *
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setLeftWidth(width: Float): Divider {
        left = Border(Color.TRANSPARENT, width)
        return this
    }

    /**
     * 设置左边的边
     *
     * @param color 边的颜色
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setLeft(@ColorInt color: Int, width: Float): Divider {
        left = Border(color, width)
        return this
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
    fun setLeft(
        @ColorInt color: Int,
        width: Float,
        startPadding: Float,
        endPadding: Float
    ): Divider {
        left = Border(color, width, startPadding, endPadding)
        return this
    }

    /**
     * 设置左边的边
     *
     * @param border 边
     * @return 当前分割线
     */
    fun setLeft(border: Border?): Divider {
        left = border
        return this
    }

    /**
     * 设置上边的边
     *
     * @param color 边的颜色
     * @return 当前分割线
     */
    fun setTopColor(@ColorInt color: Int): Divider {
        top = Border(color, 0.5f)
        return this
    }

    /**
     * 设置上边的边
     *
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setTopWidth(width: Float): Divider {
        top = Border(Color.TRANSPARENT, width)
        return this
    }

    /**
     * 设置上边的边
     *
     * @param color 边的颜色
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setTop(@ColorInt color: Int, width: Float): Divider {
        top = Border(color, width)
        return this
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
    fun setTop(
        @ColorInt color: Int,
        width: Float,
        startPadding: Float,
        endPadding: Float
    ): Divider {
        top = Border(color, width, startPadding, endPadding)
        return this
    }

    /**
     * 设置上边的边
     *
     * @param border 边
     * @return 当前分割线
     */
    fun setTop(border: Border?): Divider {
        top = border
        return this
    }

    /**
     * 设置右边的边
     *
     * @param color 边的颜色
     * @return 当前分割线
     */
    fun setRightColor(@ColorInt color: Int): Divider {
        right = Border(color, 0.5f)
        return this
    }

    /**
     * 设置右边的边
     *
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setRightWidth(width: Float): Divider {
        right = Border(Color.TRANSPARENT, width)
        return this
    }

    /**
     * 设置右边的边
     *
     * @param color 边的颜色
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setRight(@ColorInt color: Int, width: Float): Divider {
        right = Border(color, width)
        return this
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
    fun setRight(
        @ColorInt color: Int,
        width: Float,
        startPadding: Float,
        endPadding: Float
    ): Divider {
        right = Border(color, width, startPadding, endPadding)
        return this
    }

    /**
     * 设置右边的边
     *
     * @param border 边
     * @return 当前分割线
     */
    fun setRight(border: Border?): Divider {
        right = border
        return this
    }

    /**
     * 设置下边的边
     *
     * @param color 边的颜色
     * @return 当前分割线
     */
    fun setBottomColor(@ColorInt color: Int): Divider {
        bottom = Border(color, 0.5f)
        return this
    }

    /**
     * 设置下边的边
     *
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setBottomWidth(width: Float): Divider {
        bottom =
            Border(Color.TRANSPARENT, width)
        return this
    }

    /**
     * 设置下边的边
     *
     * @param color 边的颜色
     * @param width 边的宽度
     * @return 当前分割线
     */
    fun setBottom(
        @ColorInt color: Int,
        width: Float
    ): Divider {
        bottom = Border(color, width)
        return this
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
    fun setBottom(
        @ColorInt color: Int,
        width: Float,
        startPadding: Float,
        endPadding: Float
    ): Divider {
        bottom = Border(color, width, startPadding, endPadding)
        return this
    }

    /**
     * 设置下边的边
     *
     * @param border 边
     * @return 当前分割线
     */
    fun setBottom(border: Border?): Divider {
        bottom = border
        return this
    }
}