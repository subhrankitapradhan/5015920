package com.bookstore.BookstoreAPI.controllers;

import com.bookstore.BookstoreAPI.assemblers.BookResourceAssembler;
import com.bookstore.BookstoreAPI.models.Book;
import com.bookstore.BookstoreAPI.services.BookService;
import org.springframework.hateoas.EntityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookResourceAssembler assembler;

    @PostMapping
    public EntityModel<Book> createBook(@RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return assembler.toModel(createdBook);
    }

    @GetMapping("/{id}")
    public EntityModel<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return assembler.toModel(book);
    }

    @PutMapping("/{id}")
    public EntityModel<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updatedBook = bookService.updateBook(id, book);
        return assembler.toModel(updatedBook);
    }

    @GetMapping
    public List<EntityModel<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return books.stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
    }
}

