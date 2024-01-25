package com.intralot.qa.automation.core.sports.book.mobileAPI.models.coupon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetParts {

    @SerializedName("betPart")
    @Expose
    private List<BetPart> betPart = null;
    @SerializedName("rate")
    @Expose
    private Integer rate;
    @SerializedName("internalWinning")
    @Expose
    private Double internalWinning;

    public List<BetPart> getBetPart() {
        return betPart;
    }

    public void setBetPart(List<BetPart> betPart) {
        this.betPart = betPart;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Double getInternalWinning() {
        return internalWinning;
    }

    public void setInternalWinning(Double internalWinning) {
        this.internalWinning = internalWinning;
    }
}
