
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayTaxation {

    @SerializedName("amount")
    @Expose
    private Object amount;
    @SerializedName("percentage")
    @Expose
    private Integer percentage;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("vatAmount")
    @Expose
    private Object vatAmount;
    @SerializedName("vatPercentage")
    @Expose
    private Object vatPercentage;
    @SerializedName("vatType")
    @Expose
    private String vatType;

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(Object vatAmount) {
        this.vatAmount = vatAmount;
    }

    public Object getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(Object vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public String getVatType() {
        return vatType;
    }

    public void setVatType(String vatType) {
        this.vatType = vatType;
    }

}
