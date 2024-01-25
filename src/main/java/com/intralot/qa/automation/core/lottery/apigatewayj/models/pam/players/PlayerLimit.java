package com.intralot.qa.automation.core.lottery.apigatewayj.models.pam.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class PlayerLimit {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("groupId")
    @Expose
    private Integer groupId;
    @SerializedName("soFar")
    @Expose
    private BigDecimal soFar;
    @SerializedName("value")
    @Expose
    private BigDecimal value;
    @SerializedName("max")
    @Expose
    private BigDecimal max;
    @SerializedName("min")
    @Expose
    private BigDecimal min;
    @SerializedName("updatedDate")
    @Expose
    private Long updatedDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public BigDecimal getSoFar() {
        return soFar;
    }

    public void setSoFar(BigDecimal soFar) {
        this.soFar = soFar;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public Long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Long updatedDate) {
        this.updatedDate = updatedDate;
    }

}
