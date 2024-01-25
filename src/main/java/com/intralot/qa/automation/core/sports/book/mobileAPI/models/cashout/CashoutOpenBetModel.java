package com.intralot.qa.automation.core.sports.book.mobileAPI.models.cashout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CashoutOpenBetModel {
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("betId")
    @Expose
    private String betId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("cashedOutAmount")
    @Expose
    private BigDecimal cashedOutAmount;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String betId) {
        this.betId = betId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getCashedOutAmount() {
        return cashedOutAmount;
    }

    public void setCashedOutAmount(BigDecimal cashedOutAmount) {
        this.cashedOutAmount = cashedOutAmount;
    }
}
