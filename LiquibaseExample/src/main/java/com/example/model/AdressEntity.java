package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Adress")
public class AdressEntity {

    @Id
    private int id;
    @Column
    private String street;
    @Column
    private String buildingNumber;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String countryCode;
    @OneToOne(mappedBy = "creditorAddress")
    private PaymentEntity payment;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(final String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public PaymentEntity getPayment() {
        return payment;
    }

    public void setPayment(final PaymentEntity payment) {
        this.payment = payment;
    }


}
