package com.wens;

/**
 * Hello world!
 * To run: run mvn exec:java -Dexec.mainClass="com.wens.App"
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BookCart bookCart = new BookCart();
        BookAuthor author = new BookAuthor("JK Rowling");
        Book book1 = new Book("Harry Potter and the Half Blood Prince", 1, author);
        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", 1, author);
        bookCart.addBook(book1);
        bookCart.addBook(book2);
    }
}
