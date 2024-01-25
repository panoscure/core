package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.retrieve.winnings.forthe.wager;

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
