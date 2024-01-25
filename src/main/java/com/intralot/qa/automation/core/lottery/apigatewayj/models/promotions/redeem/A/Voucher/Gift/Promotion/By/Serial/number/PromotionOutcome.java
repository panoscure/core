package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromotionOutcome {
    @SerializedName("FreeBets")
    @Expose
    private FreeBets freeBets;

    public FreeBets getFreeBets() {
        return freeBets;
    }

    public void setFreeBets(FreeBets freeBets) {
        this.freeBets = freeBets;
    }
}
