package com.bookstore.BookstoreAPI.services;

import com.bookstore.BookstoreAPI.dtos.BookDTO;
import com.bookstore.BookstoreAPI.models.Book;

import java.util.List;

public interface BookService {
	Book createBook(BookDTO bookDTO);
    Book getBookById(Long id);
    Book updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
    List<Book> getAllBooks();
}
