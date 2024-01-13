package com.example.dao;

import com.example.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers(int theSortField);

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

    public List<Customer> searchCustomers(String theSearchName);

}
