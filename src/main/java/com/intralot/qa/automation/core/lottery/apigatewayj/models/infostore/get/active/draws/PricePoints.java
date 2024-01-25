package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.active.draws;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PricePoints {

    @SerializedName("amount")
    @Expose
    private float amount;
    @SerializedName("addOn")
    @Expose
    private List<Object> addOn = null;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public List<Object> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<Object> addOn) {
        this.addOn = addOn;
    }

}