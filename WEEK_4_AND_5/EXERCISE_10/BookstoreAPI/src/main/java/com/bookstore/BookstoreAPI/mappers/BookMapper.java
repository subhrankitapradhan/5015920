package com.bookstore.BookstoreAPI.mappers;

import com.bookstore.BookstoreAPI.dtos.BookDTO;
import com.bookstore.BookstoreAPI.models.Book;

import java.util.List;

import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface BookMapper {
	Book toBook(BookDTO bookDTO);
    BookDTO toBookDTO(Book book);
    List<BookDTO> toBookDTOs(List<Book> books);
    Book updateBookFromDTO(BookDTO bookDTO, Book book);
}
