
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Odd {

    @SerializedName("dec")
    @Expose
    private BigDecimal dec;
    @SerializedName("frac")
    @Expose
    private String frac;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Odd() {
    }

    /**
     * 
     * @param dec
     * @param frac
     */
    public Odd(BigDecimal dec, String frac) {
        super();
        this.dec = dec;
        this.frac = frac;
    }

    public BigDecimal getDec() {
        return dec;
    }

    public void setDec(BigDecimal dec) {
        this.dec = dec;
    }

    public String getFrac() {
        return frac;
    }

    public void setFrac(String frac) {
        this.frac = frac;
    }

}
