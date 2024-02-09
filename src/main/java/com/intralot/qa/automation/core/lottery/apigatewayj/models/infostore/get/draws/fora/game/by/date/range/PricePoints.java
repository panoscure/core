package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.draws.fora.game.by.date.range;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PricePoints {

    @SerializedName("amount")
    @Expose
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}