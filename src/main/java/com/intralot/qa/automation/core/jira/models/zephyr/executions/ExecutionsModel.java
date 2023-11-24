package com.intralot.qa.automation.core.jira.models.zephyr.executions;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExecutionsModel {

    @SerializedName("status")
    @JsonIgnore
    private Status status;
    @SerializedName("executions")
    @Expose
    private List<Execution> executions = null;
    @SerializedName("currentlySelectedExecutionId")
    @Expose
    private String currentlySelectedExecutionId;
    @SerializedName("executionSummaries")
    @Expose
    private ExecutionSummaries executionSummaries;
    @SerializedName("totalExecutions")
    @Expose
    private Integer totalExecutions;
    @SerializedName("totalExecuted")
    @Expose
    private Integer totalExecuted;
    @SerializedName("recordsCount")
    @Expose
    private Integer recordsCount;
    @SerializedName("totalExecutionEstimatedTime")
    @Expose
    private String totalExecutionEstimatedTime;
    @SerializedName("totalExecutionLoggedTime")
    @Expose
    private String totalExecutionLoggedTime;
    @SerializedName("executionsToBeLogged")
    @Expose
    private Integer executionsToBeLogged;
    @SerializedName("isExecutionWorkflowEnabledForProject")
    @Expose
    private Boolean isExecutionWorkflowEnabledForProject;
    @SerializedName("isTimeTrackingEnabled")
    @Expose
    private Boolean isTimeTrackingEnabled;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    public String getCurrentlySelectedExecutionId() {
        return currentlySelectedExecutionId;
    }

    public void setCurrentlySelectedExecutionId(String currentlySelectedExecutionId) {
        this.currentlySelectedExecutionId = currentlySelectedExecutionId;
    }

    public ExecutionSummaries getExecutionSummaries() {
        return executionSummaries;
    }

    public void setExecutionSummaries(ExecutionSummaries executionSummaries) {
        this.executionSummaries = executionSummaries;
    }

    public Integer getTotalExecutions() {
        return totalExecutions;
    }

    public void setTotalExecutions(Integer totalExecutions) {
        this.totalExecutions = totalExecutions;
    }

    public Integer getTotalExecuted() {
        return totalExecuted;
    }

    public void setTotalExecuted(Integer totalExecuted) {
        this.totalExecuted = totalExecuted;
    }

    public Integer getRecordsCount() {
        return recordsCount;
    }

    public void setRecordsCount(Integer recordsCount) {
        this.recordsCount = recordsCount;
    }

    public String getTotalExecutionEstimatedTime() {
        return totalExecutionEstimatedTime;
    }

    public void setTotalExecutionEstimatedTime(String totalExecutionEstimatedTime) {
        this.totalExecutionEstimatedTime = totalExecutionEstimatedTime;
    }

    public String getTotalExecutionLoggedTime() {
        return totalExecutionLoggedTime;
    }

    public void setTotalExecutionLoggedTime(String totalExecutionLoggedTime) {
        this.totalExecutionLoggedTime = totalExecutionLoggedTime;
    }

    public Integer getExecutionsToBeLogged() {
        return executionsToBeLogged;
    }

    public void setExecutionsToBeLogged(Integer executionsToBeLogged) {
        this.executionsToBeLogged = executionsToBeLogged;
    }

    public Boolean getIsExecutionWorkflowEnabledForProject() {
        return isExecutionWorkflowEnabledForProject;
    }

    public void setIsExecutionWorkflowEnabledForProject(Boolean isExecutionWorkflowEnabledForProject) {
        this.isExecutionWorkflowEnabledForProject = isExecutionWorkflowEnabledForProject;
    }

    public Boolean getIsTimeTrackingEnabled() {
        return isTimeTrackingEnabled;
    }

    public void setIsTimeTrackingEnabled(Boolean isTimeTrackingEnabled) {
        this.isTimeTrackingEnabled = isTimeTrackingEnabled;
    }

}