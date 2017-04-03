package com.toyotaproject.dao;

import com.toyotaproject.domain.Customer;

/**
 * Created by burakgungor on 10.03.2017.
 */
public interface customerRepository {

    public Customer getCustomerByName(String name);
    public void save(Customer customer);
}
