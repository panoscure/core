
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Odds {

    @SerializedName("decimal")
    @Expose
    private BigDecimal decimal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Odds() {
    }

    /**
     * 
     * @param decimal
     */
    public Odds(BigDecimal decimal) {
        super();
        this.decimal = decimal;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

}
