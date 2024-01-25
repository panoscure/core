package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Winnings {

    @SerializedName("spb")
    @Expose
    private Spb spb;

    public Spb getSpb() {
        return spb;
    }

    public void setSpb(Spb spb) {
        this.spb = spb;
    }
}
