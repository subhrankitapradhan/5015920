package com.bookstore.BookstoreAPI.services;

import java.util.List;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;

public interface CustomerService {

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    CustomerDTO getCustomerById(Long id);

    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);

    void deleteCustomer(Long id);

    List<CustomerDTO> getAllCustomers();
}
