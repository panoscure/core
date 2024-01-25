package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.retrieve.the.players.bets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odds {
    @SerializedName("decimal")
    @Expose
    private Double decimal;
    @SerializedName("fractional")
    @Expose
    private String fractional;

    public Double getDecimal() {
        return decimal;
    }

    public void setDecimal(Double decimal) {
        this.decimal = decimal;
    }

    public Odds withDecimal(Double decimal) {
        this.decimal = decimal;
        return this;
    }

    public String getFractional() {
        return fractional;
    }

    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

    public Odds withFractional(String fractional) {
        this.fractional = fractional;
        return this;
    }
}