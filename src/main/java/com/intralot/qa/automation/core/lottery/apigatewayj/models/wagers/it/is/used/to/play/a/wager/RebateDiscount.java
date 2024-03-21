
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RebateDiscount {

    @SerializedName("Value")
    @Expose
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
