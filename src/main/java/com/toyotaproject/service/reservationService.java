package com.toyotaproject.service;

import com.toyotaproject.domain.Reservation;

/**
 * Created by burakgungor on 10.03.2017.
 */
public interface reservationService {

    public Reservation reservationATrip(Reservation reservation);
    public Reservation getReservationById(long id);
    public Reservation deleteReservation(long id);//GERÇEKTEN SİLMEYECEĞİMİZ İÇİN UPDATE GİBİ SADECE FLAG BIRAK
    public void updateReservation(long id);
}
