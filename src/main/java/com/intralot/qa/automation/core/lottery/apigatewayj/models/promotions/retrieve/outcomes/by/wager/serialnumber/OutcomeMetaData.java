package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.outcomes.by.wager.serialnumber;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutcomeMetaData {

    @SerializedName("SpecialDrawTickets")
    @Expose
    private SpecialDrawTickets specialDrawTickets;
    @SerializedName("Gifts")
    @Expose
    private Gifts gifts;
    @SerializedName("RealMoney")
    @Expose
    private RealMoney realMoney;

    public SpecialDrawTickets getSpecialDrawTickets() {
        return specialDrawTickets;
    }

    public void setSpecialDrawTickets(SpecialDrawTickets specialDrawTickets) {
        this.specialDrawTickets = specialDrawTickets;
    }

    public Gifts getGifts() {
        return gifts;
    }

    public void setGifts(Gifts gifts) {
        this.gifts = gifts;
    }

    public RealMoney getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(RealMoney realMoney) {
        this.realMoney = realMoney;
    }

}
