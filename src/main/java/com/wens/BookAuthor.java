package com.wens;

public class BookAuthor {
    private String authorName;

    public BookAuthor(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
