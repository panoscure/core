package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.A.Voucher.Gift.Promotion.By.Serial.Number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gifts {

    @SerializedName("Value")
    @Expose
    private Integer value;
    @SerializedName("Description")
    @Expose
    private String description;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}