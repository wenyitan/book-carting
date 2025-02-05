package com.wens;

import com.wens.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    public void testGetName() {
        String bookName = "Harry Potter and the Sorcerer's Stone";
        Book book = new Book(bookName);
        String actualBookName = book.getBookName();
        assertEquals(bookName, actualBookName);
    }

    @Test
    public void testGetBookId() {
        String bookName = "Harry Potter and the Sorcerer's Stone";
        Book book = new Book(bookName, 1);
        int actualBookId = book.getBookId();
        assertEquals(1, actualBookId);
    }

    @Test
    public void testGetBookAuthorWhenSpecified() {
        String bookName = "Harry Potter and the Sorcerer's Stone";
        String bookAuthor = "JK. Rowling";
        Book book = new Book(bookName, 1, bookAuthor);
        String actualBookAuthor = book.getBookAuthor();
        assertEquals(bookAuthor, actualBookAuthor);
    }

    @Test
    public void testGetBookAuthorWhenNotSpecified() {
        String bookName = "Harry Potter and the Sorcerer's Stone";
        Book book = new Book(bookName, 1);
        String actualBookAuthor = book.getBookAuthor();
        assertEquals("Author not documented", actualBookAuthor);
    }
}
