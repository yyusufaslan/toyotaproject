package com.toyotaproject.dao.impl;

import com.toyotaproject.dao.reservationRepository;
import com.toyotaproject.domain.Reservation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by burakgungor on 10.03.2017.
 */
@Repository
public class reservationRepositoryImpl implements reservationRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Reservation reservation) {
        entityManager.persist(reservation);
    }
}
