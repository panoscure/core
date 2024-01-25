package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutcomeMetaData {

    @SerializedName("Gifts")
    @Expose
    private Gifts gifts;
    @SerializedName("FreeBets")
    @Expose
    private FreeBets freeBets;
    @SerializedName("Vouchers")
    @Expose
    private Vouchers Vouchers;

    public Gifts getGifts() {
        return gifts;
    }

    public void setGifts(Gifts gifts) {
        this.gifts = gifts;
    }

    public FreeBets getfreeBets() {
        return freeBets;
    }

    public void setfreeBets(FreeBets freeBets) {
        this.freeBets = freeBets;
    }

    public Vouchers getVouchers() {
        return Vouchers;
    }

    public void setVouchers(Vouchers Vouchers) {
        this.Vouchers = Vouchers;
    }

}