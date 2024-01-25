package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number.V1_1;

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
    @SerializedName("RealMoney")
    @Expose
    private RealMoney realMoney;

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

    public RealMoney getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(RealMoney realMoney) {
        this.realMoney = realMoney;
    }

}