package com.intralot.qa.automation.core.jira.models.executesearch;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExecuteSearchModel {

    @SerializedName("executions")
    @Expose
    private List<Execution> executions = null;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("currentIndex")
    @Expose
    private Integer currentIndex;
    @SerializedName("maxResultAllowed")
    @Expose
    private Integer maxResultAllowed;
    @SerializedName("linksNew")
    @Expose
    private List<Integer> linksNew = null;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("executionIds")
    @Expose
    private List<Object> executionIds = null;

    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getMaxResultAllowed() {
        return maxResultAllowed;
    }

    public void setMaxResultAllowed(Integer maxResultAllowed) {
        this.maxResultAllowed = maxResultAllowed;
    }

    public List<Integer> getLinksNew() {
        return linksNew;
    }

    public void setLinksNew(List<Integer> linksNew) {
        this.linksNew = linksNew;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Object> getExecutionIds() {
        return executionIds;
    }

    public void setExecutionIds(List<Object> executionIds) {
        this.executionIds = executionIds;
    }

}