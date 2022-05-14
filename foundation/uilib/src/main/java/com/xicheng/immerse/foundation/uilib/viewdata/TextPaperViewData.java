package com.xicheng.immerse.foundation.uilib.viewdata;

import javax.annotation.Nonnull;

/**
 *
 * 一页文字需要的数据
 */
public class TextPaperViewData {

    /**
     * 当前页所使用的文字源
     */
    @Nonnull
    private String sourceText;

    /**
     * 当前页在文字源中的起始位置。
     */
    private int start;

    /**
     * 当前页在文字源中的结束位置
     */
    private int end;

    /**
     * 构造一页文字所使用的数据。
     * @param sourceText 当前页使用的文字源。
     * @param start 当前页在文字源中的起始位置。
     * @param end 当前页在文字源中的结束位置。
     */
    public TextPaperViewData(@Nonnull String sourceText, int start, int end) {
        this.sourceText = sourceText;
        this.start = start;
        this.end = end;
    }

    /**
     * 获取当前页的文字源
     * @return 文字源
     */
    public @Nonnull String getSourceText() {
        return sourceText;
    }

    /**
     * 获取当前页在文字源中开始的位置
     * @return 开始位置
     */
    public int getStart() {
        return start;
    }

    /**
     * 获取当前页在文字源中的终止位置
     * @return 终止位置
     */
    public int getEnd() {
        return end;
    }
}
