package com.toyotaproject.service;

import com.toyotaproject.domain.Customer;
import com.toyotaproject.domain.Reservation;
import com.toyotaproject.domain.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.toyotaproject.dao.*;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by burakgungor on 10.03.2017.
 */
@Service
public class reservationServiceImpl implements reservationService {

    @Inject
    private reservationRepository reservationRepository;
    @Inject
    private customerRepository customerRepository;
    @Inject
    private tripRepository tripRepository;


    @Transactional
    @Override
    public Reservation reservationATrip(Reservation reservation) {
        final Customer dbCustomer =customerRepository.getCustomerByName(reservation.getCustomer().getName());

        if (dbCustomer==null)
            customerRepository.save(reservation.getCustomer());
        final Trip trip=tripRepository.findTripById(1);

        reservation.setTrip(trip);
        //reservation.setTrip(rs);
        return reservation;
    }

    public Reservation getReservationById(long id) {
        return null;
    }

    public Reservation deleteReservation(long id) {
        return null;
    }

    public void updateReservation(long id) {

    }
}
