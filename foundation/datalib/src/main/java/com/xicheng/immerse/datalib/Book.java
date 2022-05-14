package com.xicheng.immerse.datalib;


/**
 * 书籍。
 * 内部描述了一本书的信息
 *
 * @param <Source> 书籍的来源。可以是Path、Uri等
 */
public class Book<Source> {

    /**
     * 书籍的来源，可以从此处获取书籍内容。
     */
    private final Source source;

    /**
     * 书籍的大小
     */
    private int size;

    /**
     * 声明一本书，内部描述书的基本信息。
     *
     * @param source
     */
    public Book(Source source) {
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public int getSize() {
        return size;
    }
}
