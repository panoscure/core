package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stake {
    @SerializedName("amount")
    @Expose
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
