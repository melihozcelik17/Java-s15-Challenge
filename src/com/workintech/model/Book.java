package com.workintech.model;

import java.util.Objects;

public class Book {
    private int bookID;
    private String bookName;
    private String author;
    private String category;
    private boolean isIssued;

    public Book(int bookID, String bookName, String author, String category, boolean isIssued) {
        bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.isIssued = isIssued;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }
    @Override
    public String toString() {
        return "BookID: " + bookID +
                ", BookName: " + bookName +
                ", Author: " + author +
                ", Category: " + category +
                ", IsIssued: " + isIssued;
    }
}

