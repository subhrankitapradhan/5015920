package com.bookstore.BookstoreAPI.mappers;

import com.bookstore.BookstoreAPI.dtos.CustomerDTO;
import com.bookstore.BookstoreAPI.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO toDTO(Customer customer);
    Customer toEntity(CustomerDTO customerDTO);
}
