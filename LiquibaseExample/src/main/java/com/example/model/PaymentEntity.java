package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Payments")
public class PaymentEntity {

    @Id
    private String paymentId;
    @Column
    private String transactionStatus;

    @JoinColumn(name = "transactionFees_id")
    @OneToOne(fetch = FetchType.LAZY)
    private AmountEntity transactionFees;

    @Column
    private Boolean transactionFeeIndicator;

    @Column
    private String endToEndIdentification;

    @JoinColumn(name = "debtorAccount_id")
    @OneToOne(fetch = FetchType.LAZY)
    private AccountReferenceEntity debtorAccount;

    @JoinColumn(name = "instructedAmount_id")
    @OneToOne(fetch = FetchType.LAZY)
    private AmountEntity instructedAmount;

    @JoinColumn(name = "creditorAccount_id")
    @OneToOne(fetch = FetchType.LAZY)
    private AccountReferenceEntity creditorAccount;

    @Column
    private String creditorAgent;

    @Column
    private String creditorName;

    @JoinColumn(name = "creditorAddress_id")
    @OneToOne(fetch = FetchType.LAZY)
    private AdressEntity creditorAddress;

    @Column
    private String remittanceInformationUnstructured;
    
    //PRUEBA
    @Column
    private String street2;
    
    @Column
    private Date requestedExecutionDate;

    @Column
    private String scaOauth;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(final String paymentId) {
        this.paymentId = paymentId;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(final String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public AmountEntity getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(final AmountEntity transactionFees) {
        this.transactionFees = transactionFees;
    }

    public Boolean getTransactionFeeIndicator() {
        return transactionFeeIndicator;
    }

    public void setTransactionFeeIndicator(final Boolean transactionFeeIndicator) {
        this.transactionFeeIndicator = transactionFeeIndicator;
    }

    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(final String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public AccountReferenceEntity getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(final AccountReferenceEntity debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public AmountEntity getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(final AmountEntity instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public AccountReferenceEntity getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(final AccountReferenceEntity creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public String getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(final String creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(final String creditorName) {
        this.creditorName = creditorName;
    }

    public AdressEntity getCreditorAddress() {
        return creditorAddress;
    }

    public void setCreditorAddress(final AdressEntity creditorAddress) {
        this.creditorAddress = creditorAddress;
    }

    public String getRemittanceInformationUnstructured() {
        return remittanceInformationUnstructured;
    }

    public void setRemittanceInformationUnstructured(final String remittanceInformationUnstructured) {
        this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    }

    public Date getRequestedExecutionDate() {
        return requestedExecutionDate;
    }

    public void setRequestedExecutionDate(final Date requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }

    public String getScaOauth() {
        return scaOauth;
    }

    public void setScaOauth(final String scaOauth) {
        this.scaOauth = scaOauth;
    }


}
