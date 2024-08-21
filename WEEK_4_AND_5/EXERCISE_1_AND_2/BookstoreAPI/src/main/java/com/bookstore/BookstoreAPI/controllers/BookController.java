package com.bookstore.BookstoreAPI.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookstore.BookstoreAPI.models.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping
	public List<Book> getAllBooks() {
	    // Temporary code: return a static list of books
	    return List.of(new Book(1L, "Book Title", "Author Name", 29.99, "1234567890"));
	}
	@PostMapping
	public Book createBook(@RequestBody Book book) {
	    // Logic to save the book in the database (to be implemented)
	    return book;
	}
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
	    // Logic to update the book with the given id (to be implemented)
	    return book;
	}
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
	    // Logic to delete the book with the given id (to be implemented)
	}
	
}
