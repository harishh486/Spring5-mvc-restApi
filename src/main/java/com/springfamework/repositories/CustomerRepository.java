package com.springfamework.repositories;

import com.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Harish on 9/27/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
