
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number.winnings.as.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RebateDiscount {

    @SerializedName("Value")
    @Expose
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
