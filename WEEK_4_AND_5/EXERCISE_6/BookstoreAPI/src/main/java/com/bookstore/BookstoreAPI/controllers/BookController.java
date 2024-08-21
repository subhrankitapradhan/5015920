package com.bookstore.BookstoreAPI.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.BookstoreAPI.exceptions.ResourceNotFoundException;
import com.bookstore.BookstoreAPI.models.Book;

@RestController
@RequestMapping("/books")
public class BookController {
    
    private Map<Long, Book> bookRepository = new HashMap<>();

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookRepository.put(book.getId(), book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Book Created Successfully");

        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)  // Returns 204 No Content
    public void deleteBook(@PathVariable Long id) {
        bookRepository.remove(id);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookRepository.get(id);

        if (book == null) {
        	throw new ResourceNotFoundException("Book not found with id: " + id);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Fetched Book Successfully");

        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }
}

