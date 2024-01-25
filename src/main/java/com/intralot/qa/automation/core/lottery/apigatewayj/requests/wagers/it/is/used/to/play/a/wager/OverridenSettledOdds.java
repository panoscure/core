
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OverridenSettledOdds {

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

    public OverridenSettledOdds withDecimal(Integer decimal) {
        this.decimal = decimal;
        return this;
    }

    public String getFractional() {
        return fractional;
    }

    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

    public OverridenSettledOdds withFractional(String fractional) {
        this.fractional = fractional;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("decimal", decimal).append("fractional", fractional).toString();
    }

}
