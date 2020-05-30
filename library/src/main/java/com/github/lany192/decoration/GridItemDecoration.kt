package com.github.lany192.decoration

import androidx.annotation.ColorInt
import androidx.recyclerview.widget.GridLayoutManager

/**
 * 适用于GridLayoutManager
 */
class GridItemDecoration : ItemDecoration {
    private var spanCount = 0
    private var width = 1

    /**
     * 默认透明色
     */
    @ColorInt
    private var color = 0x00000000

    /**
     * 是否显示四周的边
     */
    private var isShowBorder = false

    constructor() {}
    constructor(spanCount: Int, width: Int, color: Int) {
        this.spanCount = spanCount
        checkSpanCount(spanCount)
        this.width = width
        this.color = color
    }

    constructor(manager: GridLayoutManager) {
        spanCount = manager.spanCount
        checkSpanCount(spanCount)
    }

    fun setSpanCount(spanCount: Int): GridItemDecoration {
        this.spanCount = spanCount
        checkSpanCount(spanCount)
        return this
    }

    fun setWidth(width: Int): GridItemDecoration {
        this.width = width
        return this
    }

    fun setColor(@ColorInt color: Int): GridItemDecoration {
        this.color = color
        return this
    }

    fun setShowBorder(isShowBorder: Boolean): GridItemDecoration {
        this.isShowBorder = isShowBorder
        return this
    }

    override fun getDivider(position: Int): Divider? {
        checkSpanCount(spanCount)
        val remainder = position % spanCount
        val border =
            Border(color, width.toFloat())
        return if (isShowBorder) { //要显示四周的边
            if (remainder == 0) {
                if (position < spanCount) {
                    Divider()
                        .setTop(border)
                        .setLeft(border)
                        .setRight(border)
                        .setBottom(border)
                } else {
                    Divider()
                        .setLeft(border)
                        .setRight(border)
                        .setBottom(border)
                }
            } else {
                if (position < spanCount) {
                    Divider().setTop(border)
                        .setRight(border)
                        .setBottom(border)
                } else {
                    Divider().setRight(border)
                        .setBottom(border)
                }
            }
        } else {
            if (remainder == spanCount - 1) {
                //最后一个只显示bottom
                Divider().setBottom(border)
            } else {
                Divider().setRight(border).setBottom(border)
            }
        }
    }

    private fun checkSpanCount(spanCount: Int) {
        if (spanCount < 2) {
            throw RuntimeException("SpanCount minimum is 2")
        }
    }
}