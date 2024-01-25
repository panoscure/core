package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number.V1_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Gifts {

    @SerializedName("SerialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("Value")
    @Expose
    private BigDecimal value;
    @SerializedName("Description")
    @Expose
    private String description;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
