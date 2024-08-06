package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;
@Service
public class BookService {
	private BookRepository bookRepository;

    @Autowired
	public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    
    public void addBook(String title) {
        bookRepository.saveBook(title);
    }

    public String getBook(String title) {
        return bookRepository.getBook(title);
    }
}
