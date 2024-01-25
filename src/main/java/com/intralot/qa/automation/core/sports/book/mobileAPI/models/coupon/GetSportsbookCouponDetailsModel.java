package com.intralot.qa.automation.core.sports.book.mobileAPI.models.coupon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetSportsbookCouponDetailsModel {

    @SerializedName("bet")
    @Expose
    private Bet bet;

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }
}