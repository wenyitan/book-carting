package com.wens;

import org.junit.jupiter.api.Test;

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
        Book book = new Book("Harry Potter and the Half Blood Prince", 1, "JK Rowling");
        bookCart.addBook(book);
        int actualBookCartSize = bookCart.getCartSize();
        assertEquals(1, actualBookCartSize);
    }
}
