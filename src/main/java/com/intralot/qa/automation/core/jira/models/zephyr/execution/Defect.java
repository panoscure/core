package com.intralot.qa.automation.core.jira.models.zephyr.execution;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Defect {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("resolution")
    @Expose
    private String resolution;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusId")
    @Expose
    private String statusId;
    @SerializedName("summary")
    @Expose
    private String summary;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
