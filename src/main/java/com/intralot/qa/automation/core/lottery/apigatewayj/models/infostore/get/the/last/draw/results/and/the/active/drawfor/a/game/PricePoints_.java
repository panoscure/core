package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.the.last.draw.results.and.the.active.drawfor.a.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PricePoints_ {

    @SerializedName("addOn")
    @Expose
    private List<AddOn__> addOn = null;
    @SerializedName("amount")
    @Expose
    private float amount;

    public List<AddOn__> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOn__> addOn) {
        this.addOn = addOn;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
