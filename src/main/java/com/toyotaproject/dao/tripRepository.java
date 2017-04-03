package com.toyotaproject.dao;

import com.toyotaproject.domain.Trip;

/**
 * Created by burakgungor on 10.03.2017.
 */
public interface tripRepository {

    Trip findTripById(long id);

    void init();
}
