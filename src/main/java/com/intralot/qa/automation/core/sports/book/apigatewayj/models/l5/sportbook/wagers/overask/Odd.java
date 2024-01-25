package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Odd {
    @SerializedName("decimal")
    @Expose
    private BigDecimal decimal;

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}