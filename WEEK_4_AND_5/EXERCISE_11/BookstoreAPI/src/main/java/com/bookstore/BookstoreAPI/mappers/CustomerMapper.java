package com.bookstore.BookstoreAPI.mappers;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;
import com.bookstore.BookstoreAPI.models.Customer;

import java.util.List;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerMapper {
	 Customer toCustomer(CustomerDTO customerDTO);
	    CustomerDTO toCustomerDTO(Customer customer);
	    List<CustomerDTO> toCustomerDTOs(List<Customer> customers);
	    Customer updateCustomerFromDTO(CustomerDTO customerDTO, Customer customer);
}
