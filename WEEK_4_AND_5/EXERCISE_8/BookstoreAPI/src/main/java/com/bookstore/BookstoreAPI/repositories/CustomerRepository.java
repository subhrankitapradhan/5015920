package com.bookstore.BookstoreAPI.repositories;

import com.bookstore.BookstoreAPI.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // No additional methods are required for basic CRUD operations
    // JpaRepository provides methods like findAll(), findById(), save(), deleteById(), etc.
}
