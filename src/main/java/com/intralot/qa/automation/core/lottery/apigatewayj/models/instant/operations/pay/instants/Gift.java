
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.pay.instants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gift {

    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("giftId")
    @Expose
    private Integer giftId;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

}
