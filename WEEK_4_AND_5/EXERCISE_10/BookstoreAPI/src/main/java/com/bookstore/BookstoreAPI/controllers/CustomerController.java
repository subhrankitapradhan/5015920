package com.bookstore.BookstoreAPI.controllers;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;
import com.bookstore.BookstoreAPI.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public EntityModel<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO createdCustomer = customerService.createCustomer(customerDTO);
        return EntityModel.of(createdCustomer);
    }

    @GetMapping("/{id}")
    public EntityModel<CustomerDTO> getCustomerById(@PathVariable Long id) {
        CustomerDTO customer = customerService.getCustomerById(id);
        return EntityModel.of(customer);
    }

    @PutMapping("/{id}")
    public EntityModel<CustomerDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO) {
        CustomerDTO updatedCustomer = customerService.updateCustomer(id, customerDTO);
        return EntityModel.of(updatedCustomer);
    }

    @GetMapping
    public List<EntityModel<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customers = customerService.getAllCustomers();
        return customers.stream()
                .map(EntityModel::of)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
