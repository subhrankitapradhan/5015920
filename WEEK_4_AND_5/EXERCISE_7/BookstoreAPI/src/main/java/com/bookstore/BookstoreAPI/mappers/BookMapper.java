package com.bookstore.BookstoreAPI.mappers;

import com.bookstore.BookstoreAPI.dtos.BookDTO;
import com.bookstore.BookstoreAPI.models.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
    BookDTO toBookDTO(Book book);
    Book toBook(BookDTO bookDTO);
	void updateEntityFromDto(BookDTO bookDTO, Book book);
	Book toEntity(BookDTO bookDTO);
}
