
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.order.api.creates.an.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderDetail {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("externalProductId")
    @Expose
    private Integer externalProductId;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("itemId")
    @Expose
    private Integer itemId;
    @SerializedName("unitCount")
    @Expose
    private Integer unitCount;
    @SerializedName("unitTypeId")
    @Expose
    private Integer unitTypeId;
    @SerializedName("unitType")
    @Expose
    private String unitType;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getExternalProductId() {
        return externalProductId;
    }

    public void setExternalProductId(Integer externalProductId) {
        this.externalProductId = externalProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    public Integer getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

}
