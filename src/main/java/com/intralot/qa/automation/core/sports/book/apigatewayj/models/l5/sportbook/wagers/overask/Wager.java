package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wager {
    @SerializedName("spbt")
    @Expose
    private Spbt spbt;

    public Spbt getSpbt() {
        return spbt;
    }

    public void setSpbt(Spbt spbt) {
        this.spbt = spbt;
    }
}