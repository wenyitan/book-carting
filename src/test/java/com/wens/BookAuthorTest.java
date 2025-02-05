package com.wens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookAuthorTest {
    @Test
    public void testGetBookAuthorName() {
        String authorName = "JK Rowling";
        BookAuthor author = new BookAuthor(authorName);
        String actualAuthorName = author.getAuthorName();
        assertEquals(authorName, actualAuthorName);
    }
}
