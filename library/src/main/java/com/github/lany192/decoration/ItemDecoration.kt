package com.github.lany192.decoration

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView

open class ItemDecoration : RecyclerView.ItemDecoration() {
    private val mPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(
        canvas: Canvas,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        //left, top, right, bottom
        val childCount = parent.childCount
        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)
            val itemPosition =
                (child.layoutParams as RecyclerView.LayoutParams).viewLayoutPosition
            var divider = getDivider(itemPosition)
            if (divider == null) {
                divider = Divider()
            }
            val leftBorder = divider.left
            if (leftBorder != null) {
                val lineWidth = leftBorder.width
                val startPadding = leftBorder.startPadding
                val endPadding = leftBorder.endPadding
                drawChildLeftVertical(
                    child,
                    canvas,
                    leftBorder.color,
                    lineWidth,
                    startPadding,
                    endPadding
                )
            }
            val topBorder = divider.top
            if (topBorder != null) {
                val lineWidth = topBorder.width
                val startPadding = topBorder.startPadding
                val endPadding = topBorder.endPadding
                drawChildTopHorizontal(
                    child,
                    canvas,
                    topBorder.color,
                    lineWidth,
                    startPadding,
                    endPadding
                )
            }
            val rightBorder = divider.right
            if (rightBorder != null) {
                val lineWidth = rightBorder.width
                val startPadding = rightBorder.startPadding
                val endPadding = rightBorder.endPadding
                drawChildRightVertical(
                    child,
                    canvas,
                    rightBorder.color,
                    lineWidth,
                    startPadding,
                    endPadding
                )
            }
            val bottomBorder = divider.bottom
            if (bottomBorder != null) {
                val lineWidth = bottomBorder.width
                val startPadding = bottomBorder.startPadding
                val endPadding = bottomBorder.endPadding
                drawChildBottomHorizontal(
                    child,
                    canvas,
                    bottomBorder.color,
                    lineWidth,
                    startPadding,
                    endPadding
                )
            }
        }
    }

    private fun drawChildBottomHorizontal(
        child: View,
        canvas: Canvas,
        @ColorInt color: Int,
        lineWidth: Int,
        startPadding: Int,
        endPadding: Int
    ) {
        val leftPadding: Int = if (startPadding <= 0) {
            //padding<0当作==0处理
            //上下左右默认分割线的两头都出头一个分割线的宽度，避免十字交叉的时候，交叉点是空白
            -lineWidth
        } else {
            startPadding
        }
        val rightPadding: Int = if (endPadding <= 0) {
            lineWidth
        } else {
            -endPadding
        }
        val params = child.layoutParams as RecyclerView.LayoutParams
        val left = child.left - params.leftMargin + leftPadding.toFloat()
        val right = child.right + params.rightMargin + rightPadding.toFloat()
        val top = child.bottom + params.bottomMargin.toFloat()
        val bottom = top + lineWidth
        mPaint.color = color
        canvas.drawRect(left, top, right, bottom, mPaint)
    }

    private fun drawChildTopHorizontal(
        child: View,
        canvas: Canvas,
        @ColorInt color: Int,
        lineWidth: Int,
        startPadding: Int,
        endPadding: Int
    ) {
        val leftPadding: Int = if (startPadding <= 0) {
            //padding<0当作==0处理
            //上下左右默认分割线的两头都出头一个分割线的宽度，避免十字交叉的时候，交叉点是空白
            -lineWidth
        } else {
            startPadding
        }
        val rightPadding: Int = if (endPadding <= 0) {
            lineWidth
        } else {
            -endPadding
        }
        val params = child.layoutParams as RecyclerView.LayoutParams
        val left = child.left - params.leftMargin + leftPadding.toFloat()
        val right = child.right + params.rightMargin + rightPadding.toFloat()
        val bottom = child.top - params.topMargin.toFloat()
        val top = bottom - lineWidth
        mPaint.color = color
        canvas.drawRect(left, top, right, bottom, mPaint)
    }

    private fun drawChildLeftVertical(
        child: View,
        canvas: Canvas,
        @ColorInt color: Int,
        lineWidth: Int,
        startPadding: Int,
        endPadding: Int
    ) {
        val topPadding: Int = if (startPadding <= 0) {
            //padding<0当作==0处理
            //上下左右默认分割线的两头都出头一个分割线的宽度，避免十字交叉的时候，交叉点是空白
            -lineWidth
        } else {
            startPadding
        }
        val bottomPadding: Int = if (endPadding <= 0) {
            lineWidth
        } else {
            -endPadding
        }
        val params = child.layoutParams as RecyclerView.LayoutParams
        val top = child.top - params.topMargin + topPadding.toFloat()
        val bottom = child.bottom + params.bottomMargin + bottomPadding.toFloat()
        val right = child.left - params.leftMargin.toFloat()
        val left = right - lineWidth
        mPaint.color = color
        canvas.drawRect(left, top, right, bottom, mPaint)
    }

    private fun drawChildRightVertical(
        child: View,
        canvas: Canvas,
        @ColorInt color: Int,
        lineWidth: Int,
        startPadding: Int,
        endPadding: Int
    ) {
        val topPadding: Int = if (startPadding <= 0) {
            //padding<0当作==0处理
            //上下左右默认分割线的两头都出头一个分割线的宽度，避免十字交叉的时候，交叉点是空白
            -lineWidth
        } else {
            startPadding
        }
        val bottomPadding: Int = if (endPadding <= 0) {
            lineWidth
        } else {
            -endPadding
        }
        val params = child.layoutParams as RecyclerView.LayoutParams
        val top = child.top - params.topMargin + topPadding.toFloat()
        val bottom = child.bottom + params.bottomMargin + bottomPadding.toFloat()
        val left = child.right + params.rightMargin.toFloat()
        val right = left + lineWidth
        mPaint.color = color
        canvas.drawRect(left, top, right, bottom, mPaint)
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        //outRect 看源码可知这里只是把Rect类型的outRect作为一个封装了left,right,top,bottom的数据结构,
        //作为传递left,right,top,bottom的偏移值来用的
        val itemPosition = (view.layoutParams as RecyclerView.LayoutParams).viewLayoutPosition
        var divider = getDivider(itemPosition)
        if (divider == null) {
            divider = Divider()
        }
        var left = 0
        var top = 0
        var right = 0
        var bottom = 0
        if (divider.left != null) {
            left = divider.left!!.width
        }
        if (divider.top != null) {
            top = divider.top!!.width
        }
        if (divider.right != null) {
            right = divider.right!!.width
        }
        if (divider.bottom != null) {
            bottom = divider.bottom!!.width
        }
        outRect[left, top, right] = bottom
    }

    /**
     * 如果要不同的position有不同的分割线，复写该方法
     *
     * @param position
     * @return Divider
     */
    open fun getDivider(position: Int): Divider? {
        val border = Border(Color.TRANSPARENT, 0.5f)
        //这个是默认的效果
        return Divider().setBottom(border)
    }

    init {
        mPaint.style = Paint.Style.FILL
    }
}