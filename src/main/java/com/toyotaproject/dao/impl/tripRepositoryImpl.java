package com.toyotaproject.dao.impl;

import com.toyotaproject.dao.tripRepository;
import com.toyotaproject.domain.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

/**
 * Created by burakgungor on 10.03.2017.
 */

@Repository
public class tripRepositoryImpl implements tripRepository {

    @Inject//DATE HATA VERDİ İLGİLEN
    Date date;
    @PersistenceContext
    private EntityManager entityManager;
    public Trip findTripById(long id) {
        return entityManager.find(Trip.class,id);
    }

    @Transactional
    @Override
    @PostConstruct
    public void init() {
        final Trip antalya=new Trip(date,"alanya","gezi",15,"bölüm","b15","ali ala" );
        entityManager.persist(antalya);

    }
}
