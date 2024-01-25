package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class L5OveraskModel {
    @SerializedName("serialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("wager")
    @Expose
    private Wager wager;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }
}