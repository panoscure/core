
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odd {

    @SerializedName("dec")
    @Expose
    private Float dec;
    @SerializedName("frac")
    @Expose
    private String frac;

    public Float getDec() {
        return dec;
    }

    public void setDec(Float dec) {
        this.dec = dec;
    }

    public String getFrac() {
        return frac;
    }

    public void setFrac(String frac) {
        this.frac = frac;
    }

}
