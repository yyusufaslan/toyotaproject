package com.toyotaproject.domain;
import javax.persistence.*;
import javax.validation.Valid;

/**
 * Created by burakgungor on 10.03.2017.
 */
@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;


    @Valid
    @OneToOne
    private Customer customer;


    @Valid
    @OneToOne
    private Trip trip;

    @Column(name="reservated")
    private boolean reservated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public boolean isReservated() {
        return reservated;
    }

    public void setReservated(boolean reservated) {
        this.reservated = reservated;
    }
}
