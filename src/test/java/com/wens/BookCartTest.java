package com.wens;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookCartTest {
    @Test
    public void testBookCartGetSizeReturnZeroWhenEmpty() {
        BookCart bookCart = new BookCart();
        int actualBookCartSize = bookCart.getCartSize();
        assertEquals(0, actualBookCartSize);
    }

    @Test
    public void testBookCartGetSizeReturnOneWhenOneBookAdded() {
        BookCart bookCart = new BookCart();
        BookAuthor author = new BookAuthor("JK Rowling");
        Book book = new Book("Harry Potter and the Half Blood Prince", 1, author);
        bookCart.addBook(book);
        int actualBookCartSize = bookCart.getCartSize();
        assertEquals(1, actualBookCartSize);
    }

    @Test
    public void testBookCartGetSizeReturnTwoWhenTwoBookAdded() {
        BookCart bookCart = new BookCart();
        BookAuthor author = new BookAuthor("JK Rowling");
        Book book1 = new Book("Harry Potter and the Half Blood Prince", 1, author);
        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", 1, author);
        bookCart.addBook(book1);
        bookCart.addBook(book2);
        int actualBookCartSize = bookCart.getCartSize();
        assertEquals(2, actualBookCartSize);
    }

    @Test
    public void testBookCartGetBooksReturnList() {
        BookCart bookCart = new BookCart();
        BookAuthor author = new BookAuthor("JK Rowling");
        Book book1 = new Book("Harry Potter and the Half Blood Prince", 1, author);
        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", 2, author);
        bookCart.addBook(book1);
        bookCart.addBook(book2);
        Object[] books = bookCart.getBooks().toArray();
        Book[] expectedBookArray = {book1, book2};
        assertArrayEquals(expectedBookArray, books);
    }
}
