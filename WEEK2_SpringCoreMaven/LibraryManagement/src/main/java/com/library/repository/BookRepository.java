package com.library.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class BookRepository {
    private Map<String, String> books = new HashMap<>();

    // Method to save a book
    public void saveBook(String title) {
        books.put(title, title);
        System.out.println("Book saved: " + title);
    }

    // Method to retrieve a book (example)
    public String getBook(String title) {
        return books.get(title);
    }
}
