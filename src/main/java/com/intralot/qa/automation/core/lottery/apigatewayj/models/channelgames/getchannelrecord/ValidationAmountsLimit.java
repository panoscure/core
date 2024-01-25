
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class ValidationAmountsLimit {

    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("amount")
    @Expose
    private BigDecimal amount;
    @SerializedName("operation")
    @Expose
    private String operation;
    @SerializedName("inclusiveLimit")
    @Expose
    private Boolean inclusiveLimit;
    @SerializedName("levelId")
    @Expose
    private Long levelId;
    @SerializedName("locationId")
    @Expose
    private Long locationId;
    @SerializedName("typeId")
    @Expose
    private Long typeId;
    @SerializedName("operationId")
    @Expose
    private Long operationId;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Boolean getInclusiveLimit() {
        return inclusiveLimit;
    }

    public void setInclusiveLimit(Boolean inclusiveLimit) {
        this.inclusiveLimit = inclusiveLimit;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

}
