
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number.winnings.as.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutcomeMetaData {

    @SerializedName("RebateDiscount")
    @Expose
    private RebateDiscount rebateDiscount;

    public RebateDiscount getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(RebateDiscount rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }

}
