package com.springfamework.api.v1.mapper;

import com.springfamework.api.v1.model.CustomerDTO;
import com.springfamework.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Harish on 9/27/17.
 */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
