
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelationDeadline {

    @SerializedName("columnsFrom")
    @Expose
    private Long columnsFrom;
    @SerializedName("columnsTo")
    @Expose
    private Long columnsTo;
    @SerializedName("fromDrawTime")
    @Expose
    private Long fromDrawTime;
    @SerializedName("fromPlayTime")
    @Expose
    private Object fromPlayTime;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("operation")
    @Expose
    private String operation;
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

    public Long getColumnsFrom() {
        return columnsFrom;
    }

    public void setColumnsFrom(Long columnsFrom) {
        this.columnsFrom = columnsFrom;
    }

    public Long getColumnsTo() {
        return columnsTo;
    }

    public void setColumnsTo(Long columnsTo) {
        this.columnsTo = columnsTo;
    }

    public Long getFromDrawTime() {
        return fromDrawTime;
    }

    public void setFromDrawTime(Long fromDrawTime) {
        this.fromDrawTime = fromDrawTime;
    }

    public Object getFromPlayTime() {
        return fromPlayTime;
    }

    public void setFromPlayTime(Object fromPlayTime) {
        this.fromPlayTime = fromPlayTime;
    }

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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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
