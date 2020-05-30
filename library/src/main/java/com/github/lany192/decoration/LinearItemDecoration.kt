package com.github.lany192.decoration

import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView

/**
 * 适用于LinearLayoutManager
 */
class LinearItemDecoration : ItemDecoration {
    /**
     * 分割线宽度，默认是1dp
     */
    private var width = 1

    /**
     * 默认透明色
     */
    @ColorInt
    private var color = 0x00000000

    /**
     * 方向，默认是纵向
     */
    @RecyclerView.Orientation
    private var orientation: Int

    /**
     * 分割线padding
     */
    private var padding = 0

    constructor() {
        orientation = RecyclerView.VERTICAL
    }

    constructor(@RecyclerView.Orientation orientation: Int) {
        this.orientation = orientation
    }

    constructor(width: Int, @ColorInt color: Int, @RecyclerView.Orientation orientation: Int) {
        this.width = width
        this.color = color
        this.orientation = orientation
    }

    constructor(width: Int, @ColorInt color: Int) {
        this.width = width
        this.color = color
        orientation = RecyclerView.VERTICAL
    }

    fun setWidth(width: Int): LinearItemDecoration {
        this.width = width
        return this
    }

    fun setPadding(padding: Int): LinearItemDecoration {
        this.padding = padding
        return this
    }

    fun setColor(@ColorInt color: Int): LinearItemDecoration {
        this.color = color
        return this
    }

    fun setOrientation(@RecyclerView.Orientation orientation: Int): LinearItemDecoration {
        this.orientation = orientation
        return this
    }

    override fun getDivider(position: Int): Divider? {
        require(!(orientation != RecyclerView.HORIZONTAL && orientation != RecyclerView.VERTICAL)) { "invalid orientation:$orientation" }
        val border =
            Border(color, width.toFloat(), padding.toFloat(), padding.toFloat())
        return if (orientation != RecyclerView.VERTICAL) {
            Divider().setRight(border)
        } else {
            Divider().setBottom(border)
        }
    }
}