package com.toyotaproject.dao;

import com.toyotaproject.domain.Reservation;

/**
 * Created by burakgungor on 10.03.2017.
 */
public interface reservationRepository {
    public void save(Reservation reservation);
}
