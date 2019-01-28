package com.example.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Amount")
public class AmountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String currency;
    @Column
    private BigDecimal amount;
    @OneToOne(mappedBy = "transactionFees")
    private PaymentEntity paymentEntity1;

    @OneToOne(mappedBy = "instructedAmount")
    private PaymentEntity paymentEntity2;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public PaymentEntity getPaymentEntity1() {
        return paymentEntity1;
    }

    public void setPaymentEntity1(final PaymentEntity paymentEntity1) {
        this.paymentEntity1 = paymentEntity1;
    }

    public PaymentEntity getPaymentEntity2() {
        return paymentEntity2;
    }

    public void setPaymentEntity2(final PaymentEntity paymentEntity2) {
        this.paymentEntity2 = paymentEntity2;
    }

  

}
