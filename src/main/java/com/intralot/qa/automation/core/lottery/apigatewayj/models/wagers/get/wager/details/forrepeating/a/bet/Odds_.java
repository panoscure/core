
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odds_ {

    @SerializedName("decimal")
    @Expose
    private Integer decimal;
    @SerializedName("fractional")
    @Expose
    private String fractional;

    public Integer getDecimal() {
        return decimal;
    }

    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    public String getFractional() {
        return fractional;
    }

    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

}