package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Odds {

    @SerializedName("decimal")
    @Expose
    private BigDecimal decimal;

    public Odds() {
    }

    public Odds(BigDecimal decimal) {
        this.decimal = decimal.setScale(2, RoundingMode.HALF_DOWN);
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public Odds withDecimal(BigDecimal decimal) {
        this.decimal = decimal;
        return this;
    }

}
