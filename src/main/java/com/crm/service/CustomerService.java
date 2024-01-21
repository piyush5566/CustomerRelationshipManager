package com.crm.service;

import com.crm.entity.Customer;

import java.util.List;

public interface CustomerService {


    public List<Customer> getCustomers(int sortField);

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

    public List<Customer> searchCustomer(String theSearchName);
}
