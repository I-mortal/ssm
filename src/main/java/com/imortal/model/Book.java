package com.imortal.model;

/**
 * @ClassName Book
 * @Description
 * @Author 一人树杨
 * @Date 2021/7/10 14:17
 **/
public class Book {

    private int bookId;
    private String bookName;
    private int bookCount;
    private String detail;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
