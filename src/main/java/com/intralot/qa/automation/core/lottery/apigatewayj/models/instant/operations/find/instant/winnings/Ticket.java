
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.find.instant.winnings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("commision")
    @Expose
    private Integer commision;
    @SerializedName("creditIndicator")
    @Expose
    private Integer creditIndicator;
    @SerializedName("sellingLocation")
    @Expose
    private Integer sellingLocation;
    @SerializedName("tier")
    @Expose
    private Integer tier;
    @SerializedName("tierLevel")
    @Expose
    private Integer tierLevel;
    @SerializedName("tierType")
    @Expose
    private Integer tierType;
    @SerializedName("amounts")
    @Expose
    private Amounts amounts;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("gift")
    @Expose
    private Gift gift;
    @SerializedName("statusDescription")
    @Expose
    private String statusDescription;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCommision() {
        return commision;
    }

    public void setCommision(Integer commision) {
        this.commision = commision;
    }

    public Integer getCreditIndicator() {
        return creditIndicator;
    }

    public void setCreditIndicator(Integer creditIndicator) {
        this.creditIndicator = creditIndicator;
    }

    public Integer getSellingLocation() {
        return sellingLocation;
    }

    public void setSellingLocation(Integer sellingLocation) {
        this.sellingLocation = sellingLocation;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getTierLevel() {
        return tierLevel;
    }

    public void setTierLevel(Integer tierLevel) {
        this.tierLevel = tierLevel;
    }

    public Integer getTierType() {
        return tierType;
    }

    public void setTierType(Integer tierType) {
        this.tierType = tierType;
    }

    public Amounts getAmounts() {
        return amounts;
    }

    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
