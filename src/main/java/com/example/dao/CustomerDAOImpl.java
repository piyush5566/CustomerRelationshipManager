package com.example.dao;

import com.example.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers(int theSortField) {
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
    }

    @Override
    public void deleteCustomer(int theId) {
    }

    @Override
    public List<Customer> searchCustomers(String theSearchName) {
    }

    @Override
    public Customer getCustomer(int theId) {
    }
}
