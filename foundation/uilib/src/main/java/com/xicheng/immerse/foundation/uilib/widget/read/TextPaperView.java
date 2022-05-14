package com.xicheng.immerse.foundation.uilib.widget.read;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.xicheng.immerse.foundation.uilib.viewdata.TextPaperViewData;

import javax.annotation.Nonnull;

/**
 *
 * 纸张视图，用于显示文字。
 */
public class TextPaperView extends View {

    //////// 需要外部传入的属性 //////////

    /**
     * 绘制字体使用的画笔。
     * 建议从外部传入统一使用保证字体样式一致
     */
    private TextPaint textPaint;

    /**
     * 一页文字所需要的数据
     */
    private TextPaperViewData viewData;


    ///////  以下为默认重写构造参数  ////////

    public TextPaperView(Context context) {
        this(context, null);
    }

    public TextPaperView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextPaperView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public TextPaperView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //////// 以下为自定义实现  ////////

    /**
     * 视图被初始化时调用，初始化相关属性
     */
    private void init() {
        textPaint = new TextPaint();
    }

    public TextPaint getTextPaint() {
        return textPaint;
    }

    public void setTextPaint(@Nonnull TextPaint textPaint) {
        this.textPaint = textPaint;
    }

    public TextPaperViewData getViewData() {
        return viewData;
    }

    public void setViewData(@NonNull TextPaperViewData viewData) {
        this.viewData = viewData;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaperViewData viewData = this.viewData;

        if ((canvas == null) || (viewData == null)) {
            return;
        }
        int width = getWidth() - getPaddingLeft() - getPaddingRight();
        canvas.translate(getPaddingLeft(),getPaddingTop());
        StaticLayout.Builder
                .obtain(
                        viewData.getSourceText(),
                        viewData.getStart(), viewData.getEnd(),
                        textPaint, width
                ).build()
                .draw(canvas);
    }
}
