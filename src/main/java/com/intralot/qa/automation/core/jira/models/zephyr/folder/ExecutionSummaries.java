package com.intralot.qa.automation.core.jira.models.zephyr.folder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExecutionSummaries {

    @SerializedName("executionSummary")
    @Expose
    private List<ExecutionSummary> executionSummary = null;

    public List<ExecutionSummary> getExecutionSummary() {
        return executionSummary;
    }

    public void setExecutionSummary(List<ExecutionSummary> executionSummary) {
        this.executionSummary = executionSummary;
    }
}
