package com.wens;

import java.util.ArrayList;
import java.util.List;

public class BookCart {
    List<Book> cart = new ArrayList<>();

    public int getCartSize() {
        return cart.size();
    }

    public void addBook(Book book) {
        cart.add(book);
    }

}
