package com.crm.dao;

import com.crm.Utils.SortUtils;
import com.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers(int theSortField) {
        Session currentSession = sessionFactory.getCurrentSession();

        String theFieldName = null;

        switch(theSortField){
            case SortUtils.FIRST_NAME:
                theFieldName = "firstName";
                break;
            case SortUtils.EMAIL:
                theFieldName = "email";
                break;
            default:
                theFieldName = "lastName";
        }

        SelectionQuery<Customer> theQuery = currentSession.createSelectionQuery("from Customer ORDER BY " + theFieldName, Customer.class);

        return theQuery.getResultList();
    }


    @Override
    public void saveCustomer(Customer theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.merge(theCustomer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();

        return currentSession.get(Customer.class, theId);
    }
    @Override
    public void deleteCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();

        MutationQuery theQuery = currentSession.createMutationQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", theId);
        theQuery.executeUpdate();
    }

    @Override
    public List<Customer> searchCustomers(String theSearchName) {
        Session currentSession = sessionFactory.getCurrentSession();

        SelectionQuery<Customer> theQuery = null;

        if(theSearchName != null && !theSearchName.trim().isEmpty()){
            theQuery = currentSession.createSelectionQuery("from Customer where " + "lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
        }else{
            theQuery = currentSession.createSelectionQuery("from Customer", Customer.class);
        }
        return theQuery.getResultList();
    }


}
