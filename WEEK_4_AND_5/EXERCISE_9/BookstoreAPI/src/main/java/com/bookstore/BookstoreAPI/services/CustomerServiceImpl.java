package com.bookstore.BookstoreAPI.services;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;
import com.bookstore.BookstoreAPI.models.Customer;
import com.bookstore.BookstoreAPI.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO); // Assuming a constructor or a method to convert CustomerDTO to Customer
        Customer savedCustomer = customerRepository.save(customer);
        return new CustomerDTO(savedCustomer); // Assuming a constructor or a method to convert Customer to CustomerDTO
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(CustomerDTO::new).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        Customer existingCustomer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        existingCustomer.updateFromDTO(customerDTO); // Assuming a method to update fields from CustomerDTO
        Customer updatedCustomer = customerRepository.save(existingCustomer);
        return new CustomerDTO(updatedCustomer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(CustomerDTO::new) // Convert each Customer to CustomerDTO
                .collect(Collectors.toList());
    }
}
