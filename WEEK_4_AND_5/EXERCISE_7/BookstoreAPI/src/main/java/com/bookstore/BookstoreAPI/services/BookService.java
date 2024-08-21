package com.bookstore.BookstoreAPI.services;

import com.bookstore.BookstoreAPI.dtos.BookDTO;
import com.bookstore.BookstoreAPI.models.Book;

import java.util.List;

public interface BookService {
	List<Book> getAllBooks();
    BookDTO getBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);
    Book createBook(BookDTO bookDTO);
    Book updateBook(Long id, BookDTO bookDTO);
}
