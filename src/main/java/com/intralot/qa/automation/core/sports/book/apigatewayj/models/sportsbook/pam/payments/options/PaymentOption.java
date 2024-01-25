package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.pam.payments.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class PaymentOption {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("gateway")
    @Expose
    private String gateway;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("paymentMethod")
    @Expose
    private String paymentMethod;
    @SerializedName("deposits")
    @Expose
    private Boolean deposits;
    @SerializedName("withdrawals")
    @Expose
    private Boolean withdrawals;
    @SerializedName("activateDate")
    @Expose
    private String activateDate;
    @SerializedName("lastUsed")
    @Expose
    private String lastUsed;
    @SerializedName("instrument")
    @Expose
    private Instrument instrument;
    @SerializedName("stored")
    @Expose
    private Boolean stored;
    @SerializedName("maxDepositLimit")
    @Expose
    private BigDecimal maxDepositLimit;
    @SerializedName("minDepositLimit")
    @Expose
    private BigDecimal minDepositLimit;
    @SerializedName("maxWithdrawalLimit")
    @Expose
    private BigDecimal maxWithdrawalLimit;
    @SerializedName("minWithdrawalLimit")
    @Expose
    private BigDecimal minWithdrawalLimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Boolean getDeposits() {
        return deposits;
    }

    public void setDeposits(Boolean deposits) {
        this.deposits = deposits;
    }

    public Boolean getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(Boolean withdrawals) {
        this.withdrawals = withdrawals;
    }

    public String getActivateDate() {
        return activateDate;
    }

    public void setActivateDate(String activateDate) {
        this.activateDate = activateDate;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Boolean getStored() {
        return stored;
    }

    public void setStored(Boolean stored) {
        this.stored = stored;
    }

    public BigDecimal getMaxDepositLimit() {
        return maxDepositLimit;
    }

    public void setMaxDepositLimit(BigDecimal maxDepositLimit) {
        this.maxDepositLimit = maxDepositLimit;
    }

    public BigDecimal getMinDepositLimit() {
        return minDepositLimit;
    }

    public void setMinDepositLimit(BigDecimal minDepositLimit) {
        this.minDepositLimit = minDepositLimit;
    }

    public BigDecimal getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(BigDecimal maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public BigDecimal getMinWithdrawalLimit() {
        return minWithdrawalLimit;
    }

    public void setMinWithdrawalLimit(BigDecimal minWithdrawalLimit) {
        this.minWithdrawalLimit = minWithdrawalLimit;
    }
}