package com.bookstore.BookstoreAPI.repositories;

import com.bookstore.BookstoreAPI.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository provides methods like save(), findById(), deleteById(), existsById(), and findAll()
}
