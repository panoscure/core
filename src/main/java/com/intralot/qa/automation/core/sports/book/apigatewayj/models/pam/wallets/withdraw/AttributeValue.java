package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.withdraw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttributeValue {
    @SerializedName("attrExtraID")
    @Expose
    private Integer attrExtraID;
    @SerializedName("attrValue1")
    @Expose
    private String attrValue1;
    @SerializedName("attrValue2")
    @Expose
    private String attrValue2;
    @SerializedName("attributeName")
    @Expose
    private String attributeName;

    public Integer getAttrExtraID() {
        return attrExtraID;
    }

    public void setAttrExtraID(Integer attrExtraID) {
        this.attrExtraID = attrExtraID;
    }

    public String getAttrValue1() {
        return attrValue1;
    }

    public void setAttrValue1(String attrValue1) {
        this.attrValue1 = attrValue1;
    }

    public String getAttrValue2() {
        return attrValue2;
    }

    public void setAttrValue2(String attrValue2) {
        this.attrValue2 = attrValue2;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
