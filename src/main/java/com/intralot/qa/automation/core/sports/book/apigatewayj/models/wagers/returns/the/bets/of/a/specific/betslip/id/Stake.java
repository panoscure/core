package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.returns.the.bets.of.a.specific.betslip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stake {
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Stake withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Stake withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}