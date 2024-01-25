package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.A.Voucher.Gift.Promotion.By.Serial.Number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutcomeMetaData {

    @SerializedName("RealMoney")
    @Expose
    private RealMoney realMoney;
    @SerializedName("NonWin")
    @Expose
    private NonWin nonWin;
    @SerializedName("Vouchers")
    @Expose
    private Vouchers vouchers;

    public RealMoney getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(RealMoney realMoney) {
        this.realMoney = realMoney;
    }

    public NonWin getNonWin() {
        return nonWin;
    }

    public void setNonWin(NonWin nonWin) {
        this.nonWin = nonWin;
    }

    public Vouchers getVouchers() {
        return vouchers;
    }

    public void setVouchers(Vouchers vouchers) {
        this.vouchers = vouchers;
    }

}
