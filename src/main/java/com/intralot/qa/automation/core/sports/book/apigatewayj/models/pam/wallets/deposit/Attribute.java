package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.deposit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribute {
    @SerializedName("attrName")
    @Expose
    private String attrName;
    @SerializedName("attrValue")
    @Expose
    private String attrValue;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}
