package com.wens;

public class Book {
    private String bookName;
    private int bookId;
    private BookAuthor bookAuthor = new BookAuthor("Author not documented");

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

    public BookAuthor getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(BookAuthor bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }

    public Book(String bookName, int bookId, BookAuthor bookAuthor) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", bookAuthor=" + bookAuthor +
                '}';
    }
}
