
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Odds {

    @SerializedName("decimal")
    @Expose
    private BigDecimal decimal;
    @SerializedName("fractional")
    @Expose
    private String fractional;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Odds() {
    }

    /**
     * 
     * @param fractional
     * @param decimal
     */
    public Odds(BigDecimal decimal, String fractional) {
        super();
        this.decimal = decimal;
        this.fractional = fractional;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public String getFractional() {
        return fractional;
    }

    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

}