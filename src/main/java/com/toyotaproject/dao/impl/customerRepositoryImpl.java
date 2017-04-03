package com.toyotaproject.dao.impl;

import com.toyotaproject.dao.customerRepository;
import com.toyotaproject.domain.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * Created by burakgungor on 10.03.2017.
 */
@Repository
public class customerRepositoryImpl implements customerRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public Customer getCustomerByName(String name) {
        Customer result=null;
        try{
            result=(Customer)entityManager.createQuery("from Customer c where c.name=:name")
                    .setParameter("name",name).getSingleResult();
        }catch (final NoResultException e){
        }
        return null;
    }
    @Override
    public void save(final Customer customer) {entityManager.persist(customer);}
}
