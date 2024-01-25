
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PricePoints {

    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("unitType")
    @Expose
    private String unitType;
    @SerializedName("minBetAmount")
    @Expose
    private Double minBetAmount;
    @SerializedName("maxBetAmount")
    @Expose
    private Double maxBetAmount;
    @SerializedName("addOn")
    @Expose
    private Object addOn;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Double getMinBetAmount() {
        return minBetAmount;
    }

    public void setMinBetAmount(Double minBetAmount) {
        this.minBetAmount = minBetAmount;
    }

    public Double getMaxBetAmount() {
        return maxBetAmount;
    }

    public void setMaxBetAmount(Double maxBetAmount) {
        this.maxBetAmount = maxBetAmount;
    }

    public Object getAddOn() {
        return addOn;
    }

    public void setAddOn(Object addOn) {
        this.addOn = addOn;
    }

}
