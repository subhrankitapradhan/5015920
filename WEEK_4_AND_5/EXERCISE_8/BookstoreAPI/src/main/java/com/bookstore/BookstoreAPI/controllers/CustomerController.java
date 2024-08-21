package com.bookstore.BookstoreAPI.controllers;

import com.bookstore.BookstoreAPI.models.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        // In a real application, you'd save the customer to a database
        // Here, we're just returning the customer object for demonstration
        return customer;
    }
    @PostMapping("/register")
    public String registerCustomer(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String address
    ) {
        // Simulate saving the customer to a database
        return "Customer " + name + " registered with email " + email + " and address " + address;
    }
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // This returns the register.html template
    }
}