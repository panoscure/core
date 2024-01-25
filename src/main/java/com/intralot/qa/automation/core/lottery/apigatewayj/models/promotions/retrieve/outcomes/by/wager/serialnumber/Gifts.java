package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.outcomes.by.wager.serialnumber;

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