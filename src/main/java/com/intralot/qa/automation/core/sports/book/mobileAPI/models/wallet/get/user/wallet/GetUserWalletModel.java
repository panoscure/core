package com.intralot.qa.automation.core.sports.book.mobileAPI.models.wallet.get.user.wallet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class GetUserWalletModel {
    @SerializedName("clientID")
    @Expose
    private Integer clientID;
    @SerializedName("currencyISO")
    @Expose
    private String currencyISO;
    @SerializedName("currentBalance")
    @Expose
    private BigDecimal currentBalance;
    @SerializedName("maxAllowedWithdrawals")
    @Expose
    private BigDecimal maxAllowedWithdrawals;
    @SerializedName("nonWitdrawableFunds")
    @Expose
    private BigDecimal nonWitdrawableFunds;
    @SerializedName("currentRealBalance")
    @Expose
    private BigDecimal currentRealBalance;

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getMaxAllowedWithdrawals() {
        return maxAllowedWithdrawals;
    }

    public void setMaxAllowedWithdrawals(BigDecimal maxAllowedWithdrawals) {
        this.maxAllowedWithdrawals = maxAllowedWithdrawals;
    }

    public BigDecimal getNonWitdrawableFunds() {
        return nonWitdrawableFunds;
    }

    public void setNonWitdrawableFunds(BigDecimal nonWitdrawableFunds) {
        this.nonWitdrawableFunds = nonWitdrawableFunds;
    }

    public BigDecimal getCurrentRealBalance() {
        return currentRealBalance;
    }

    public void setCurrentRealBalance(BigDecimal currentRealBalance) {
        this.currentRealBalance = currentRealBalance;
    }
}
