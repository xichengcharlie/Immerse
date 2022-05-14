package com.xicheng.immerse.datalib;

/**
 * 书籍{@link Book}中的一页。
 */
public class TextPaper {

    /**
     * 当前页所在的书籍。
     */
    private final Book book;

    /**
     * 当前页在书籍中的页数。
     */
    private final int index;

    /**
     * 当前页开始字符在整本书的字符中的位置。
     */
    private final int startCharIndex;

    /**
     * 当前页的终止字符在整本书的字符的位置。
     */
    private final int endCharIndex;


    public TextPaper(Book book, int index, int startCharIndex, int endCharIndex) {
        this.book = book;
        this.index = index;
        this.startCharIndex = startCharIndex;
        this.endCharIndex = endCharIndex;
    }

    public Book getBook() {
        return book;
    }

    public int getIndex() {
        return index;
    }

    public int getStartCharIndex() {
        return startCharIndex;
    }

    public int getEndCharIndex() {
        return endCharIndex;
    }
}
