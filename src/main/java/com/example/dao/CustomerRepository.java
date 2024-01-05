package com.example.dao;

import com.example.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    Customer findCustomerById(Integer id);
}
