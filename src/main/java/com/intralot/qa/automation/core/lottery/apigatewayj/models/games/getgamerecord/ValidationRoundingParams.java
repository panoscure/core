
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidationRoundingParams {

    @SerializedName("digits")
    @Expose
    private Long digits;
    @SerializedName("type")
    @Expose
    private String type;

    public Long getDigits() {
        return digits;
    }

    public void setDigits(Long digits) {
        this.digits = digits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}