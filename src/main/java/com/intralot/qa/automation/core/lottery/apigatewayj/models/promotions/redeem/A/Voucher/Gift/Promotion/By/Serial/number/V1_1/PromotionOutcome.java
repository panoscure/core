package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number.V1_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromotionOutcome {
    @SerializedName("FreeBets")
    @Expose
    private FreeBets freeBets;
    @SerializedName("RealMoney")
    @Expose
    private RealMoney realMoney;
    @SerializedName("Gifts")
    @Expose
    private Gifts gifts;
    @SerializedName("RebateDiscount")
    @Expose
    private RebateDiscount rebateDiscount;

    public FreeBets getFreeBets() {
        return freeBets;
    }

    public void setFreeBets(FreeBets freeBets) {
        this.freeBets = freeBets;
    }

    public RealMoney getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(RealMoney realMoney) {
        this.realMoney = realMoney;
    }

    public Gifts getGifts() {
        return gifts;
    }

    public void setGifts(Gifts gifts) {
        this.gifts = gifts;
    }

    public RebateDiscount getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(RebateDiscount rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }
}
