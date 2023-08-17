package com.workintech.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookSystem {
        private Map<Integer, Book> books;
        private Map<Integer, Member> member;


    public BookSystem() {
            books = new HashMap<>();
            member = new HashMap<>();
        }
        public void addBook(Book book) {
            books.put(book.getBookID(), book);
        }

        public Book getBookID(int id) {
            return books.get(id);
        }
        public List<Book> getBooksByName(String bookName) {
            return books.values().stream()
                    .filter(book -> book.getBookName().equals(bookName)).collect(Collectors.toList());
        }


        public List<Book> getBooksByAuthor(String authorName) {
            return books.values().stream().filter(book -> book.getAuthor().equals(authorName)).collect(Collectors.toList());
        }

        public void updateBook(Book book) {
            books.put(book.getBookID(), book);
        }

        public void removeBook(int bookID) {
            books.remove(bookID);
        }

        public List<Book> getBooksByCategory(Category category) {
            return books.values().stream().filter(book -> book.getCategory().equals(category)).collect(Collectors.toList());
        }

        public List<Book> getBooksByAuthor(Author author) {
            return books.values().stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
        }


    @Override
    public String toString() {
        return "Data{" +
                "books=" + books +
                ", member=" + member +
                '}';
    }
}
