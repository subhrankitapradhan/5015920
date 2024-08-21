package com.bookstore.BookstoreAPI.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bookstore.BookstoreAPI.models.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Example implementation (in a real app, this would likely query a database)
        return new Book(id, "Sample Book", "Sample Author", 19.99, "1234567890");
    }
	private List<Book> books = List.of(
	        new Book(1L, "Java Basics", "John Doe", 29.99, "1234567890"),
	        new Book(2L, "Spring Boot Guide", "Jane Doe", 39.99, "1234567891"),
	        new Book(3L, "Advanced Java", "John Doe", 49.99, "1234567892")
	    );

	    @GetMapping
	    public List<Book> getBooksByTitleAndAuthor(
	        @RequestParam(required = false) String title,
	        @RequestParam(required = false) String author
	    ) {
	        return books.stream()
	            .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
	                            (author == null || book.getAuthor().equalsIgnoreCase(author)))
	            .collect(Collectors.toList());
	    }
}
