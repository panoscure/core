package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.pam.deposit.initiate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("PAYSAFE")
    @Expose
    private String paysafe;

    public String getPaysafe() {
        return paysafe;
    }

    public void setPaysafe(String paysafe) {
        this.paysafe = paysafe;
    }
}