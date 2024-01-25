package com.intralot.qa.automation.core.sports.book.mobileAPI.models.coupon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildBetSummary {

    @SerializedName("selectionIds")
    @Expose
    private List<Integer> selectionIds = null;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("totalPrice")
    @Expose
    private Double totalPrice;
    @SerializedName("payout")
    @Expose
    private Double payout;

    public List<Integer> getSelectionIds() {
        return selectionIds;
    }

    public void setSelectionIds(List<Integer> selectionIds) {
        this.selectionIds = selectionIds;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
    }
}