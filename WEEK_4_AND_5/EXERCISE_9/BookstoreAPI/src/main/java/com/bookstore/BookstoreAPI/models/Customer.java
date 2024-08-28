package com.bookstore.BookstoreAPI.models;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Customer() {
    }

    public Customer(CustomerDTO customerDTO) {
        this.name = customerDTO.getName();
        this.email = customerDTO.getEmail();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateFromDTO(CustomerDTO customerDTO) {
        this.name = customerDTO.getName();
        this.email = customerDTO.getEmail();
    }
}

