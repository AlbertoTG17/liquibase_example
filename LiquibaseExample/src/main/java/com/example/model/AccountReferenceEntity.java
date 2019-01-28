package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "AccountReference")
public class AccountReferenceEntity {

    @Id
    private int id;

//    @Column
//    private String iban;

    @Column
    private String currency;

    @OneToOne(mappedBy = "debtorAccount")
    private PaymentEntity paymentEntity1;

    @OneToOne(mappedBy = "creditorAccount")
    private PaymentEntity paymentEntity2;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(final int id) {
//        this.id = id;
//    }
//
//    public PaymentEntity getPayment() {
//        return paymentEntity1;
//    }
//
//    public void setPayment(final PaymentEntity payment) {
//        this.paymentEntity1 = payment;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(final String iban) {
//        this.iban = iban;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(final String currency) {
//        this.currency = currency;
//    }
//
//    public PaymentEntity getPaymentEntity1() {
//        return paymentEntity1;
//    }
//
//    public void setPaymentEntity1(final PaymentEntity paymentEntity1) {
//        this.paymentEntity1 = paymentEntity1;
//    }
//
//    public PaymentEntity getPaymentEntity2() {
//        return paymentEntity2;
//    }
//
//    public void setPaymentEntity2(final PaymentEntity paymentEntity2) {
//        this.paymentEntity2 = paymentEntity2;
//
//    }



}
