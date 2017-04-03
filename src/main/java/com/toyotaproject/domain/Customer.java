package com.toyotaproject.domain;

import javax.persistence.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
/**
 * Created by burakgungor on 10.03.2017.
 */

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;


    @NotBlank
    @Length(min=1, max=10)
    @Column(name="name")
    private String name;


    @NotBlank
    @Length(min=1,max=10)
    @Column(name="firstname")
    private String firstname;


    @NotBlank
    @Length(min=1,max=10)
    @Column(name="password")
    private String password;

    public Customer(String name, String firstname, String password) {
        this.name = name;
        this.firstname = firstname;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
