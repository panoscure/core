package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PricePoints {

    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("unitType")
    @Expose
    private String unitType;
    @SerializedName("unitTypeCount")
    @Expose
    private Object unitTypeCount;
    @SerializedName("minBetAmount")
    @Expose
    private Integer minBetAmount;
    @SerializedName("maxBetAmount")
    @Expose
    private Integer maxBetAmount;
    @SerializedName("scalablePriceRules")
    @Expose
    private Object scalablePriceRules;
    @SerializedName("addOn")
    @Expose
    private Object addOn;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Object getUnitTypeCount() {
        return unitTypeCount;
    }

    public void setUnitTypeCount(Object unitTypeCount) {
        this.unitTypeCount = unitTypeCount;
    }

    public Integer getMinBetAmount() {
        return minBetAmount;
    }

    public void setMinBetAmount(Integer minBetAmount) {
        this.minBetAmount = minBetAmount;
    }

    public Integer getMaxBetAmount() {
        return maxBetAmount;
    }

    public void setMaxBetAmount(Integer maxBetAmount) {
        this.maxBetAmount = maxBetAmount;
    }

    public Object getScalablePriceRules() {
        return scalablePriceRules;
    }

    public void setScalablePriceRules(Object scalablePriceRules) {
        this.scalablePriceRules = scalablePriceRules;
    }

    public Object getAddOn() {
        return addOn;
    }

    public void setAddOn(Object addOn) {
        this.addOn = addOn;
    }

}
