package com.bookstore.BookstoreAPI.services;

import com.bookstore.BookstoreAPI.dtos.BookDTO;
import com.bookstore.BookstoreAPI.models.Book;
import com.bookstore.BookstoreAPI.repositories.BookRepository;
import com.bookstore.BookstoreAPI.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book createBook(BookDTO bookDTO) {
        Book book = bookMapper.toBook(bookDTO);
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Override
    public Book updateBook(Long id, BookDTO bookDTO) {
        Book existingBook = getBookById(id);
        Book updatedBook = bookMapper.updateBookFromDTO(bookDTO, existingBook);
        return bookRepository.save(updatedBook);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

	
}
