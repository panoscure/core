package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number.V1_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class RealMoney {
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Value")
    @Expose
    private BigDecimal value;
    @SerializedName("winDetails")
    @Expose
    private WinDetails winDetails;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public WinDetails getWinDetails() {
        return winDetails;
    }

    public void setWinDetails(WinDetails winDetails) {
        this.winDetails = winDetails;
    }

}
