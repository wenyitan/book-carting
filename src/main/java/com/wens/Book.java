package com.wens;

public class Book {
    private String bookName;
    private int bookId;
    private String bookAuthor = "Author not documented";

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }

    public Book(String bookName, int bookId, String bookAuthor) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
    }
}
