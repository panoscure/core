package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.last.drawsfor.a.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PricePoints {

    @SerializedName("addOn")
    @Expose
    private List<AddOn> addOn = null;
    @SerializedName("amount")
    @Expose
    private float amount;

    public List<AddOn> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOn> addOn) {
        this.addOn = addOn;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
