
package com.intralot.qa.automation.core.lottery.apigatewayj.models.draw.operations.v3_1.get.drawv3_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PricePoints {

    @SerializedName("amount")
    @Expose
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
