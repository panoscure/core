
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Stake {

    @SerializedName("amount")
    @Expose
    private BigDecimal amount;
    @SerializedName("currency")
    @Expose
    private String currency;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stake() {
    }

    /**
     * 
     * @param amount
     * @param currency
     */
    public Stake(BigDecimal amount, String currency) {
        super();
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}