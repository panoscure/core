package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.cashouts.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CashoutsABetModel {
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

    public CashoutsABetModel withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String betId) {
        this.betId = betId;
    }

    public CashoutsABetModel withBetId(String betId) {
        this.betId = betId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CashoutsABetModel withStatus(String status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCashedOutAmount() {
        return cashedOutAmount;
    }

    public void setCashedOutAmount(BigDecimal cashedOutAmount) {
        this.cashedOutAmount = cashedOutAmount;
    }

    public CashoutsABetModel withCashedOutAmount(BigDecimal cashedOutAmount) {
        this.cashedOutAmount = cashedOutAmount;
        return this;
    }
}