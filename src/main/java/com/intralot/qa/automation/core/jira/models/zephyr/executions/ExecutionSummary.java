package com.intralot.qa.automation.core.jira.models.zephyr.executions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExecutionSummary {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("statusKey")
    @Expose
    private Integer statusKey;
    @SerializedName("statusName")
    @Expose
    private String statusName;
    @SerializedName("statusColor")
    @Expose
    private String statusColor;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatusKey() {
        return statusKey;
    }

    public void setStatusKey(Integer statusKey) {
        this.statusKey = statusKey;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusColor() {
        return statusColor;
    }

    public void setStatusColor(String statusColor) {
        this.statusColor = statusColor;
    }

}