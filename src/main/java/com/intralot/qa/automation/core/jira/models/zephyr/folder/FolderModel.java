package com.intralot.qa.automation.core.jira.models.zephyr.folder;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FolderModel {

    @SerializedName("folderId")
    @Expose
    private Integer folderId;
    @SerializedName("folderName")
    @Expose
    private String folderName;
    @SerializedName("folderDescription")
    @Expose
    private String folderDescription;
    @SerializedName("cycleId")
    @Expose
    private Integer cycleId;
    @SerializedName("cycleName")
    @Expose
    private String cycleName;
    @SerializedName("projectId")
    @Expose
    private Integer projectId;
    @SerializedName("projectKey")
    @Expose
    private String projectKey;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("versionId")
    @Expose
    private Integer versionId;
    @SerializedName("folderOrderId")
    @Expose
    private Integer folderOrderId;
    @SerializedName("executionSummaries")
    @Expose
    private ExecutionSummaries executionSummaries;
    @SerializedName("totalExecutions")
    @Expose
    private Integer totalExecutions;
    @SerializedName("totalExecuted")
    @Expose
    private Integer totalExecuted;
    @SerializedName("isTimeTrackingEnabled")
    @Expose
    private Boolean isTimeTrackingEnabled;

    @SerializedName("projectName")
    @Expose
    private String projectName;

    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderDescription() {
        return folderDescription;
    }

    public void setFolderDescription(String folderDescription) {
        this.folderDescription = folderDescription;
    }

    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public String getCycleName() {
        return cycleName;
    }

    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getFolderOrderId() {
        return folderOrderId;
    }

    public void setFolderOrderId(Integer folderOrderId) {
        this.folderOrderId = folderOrderId;
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

    public Boolean getIsTimeTrackingEnabled() {
        return isTimeTrackingEnabled;
    }

    public void setIsTimeTrackingEnabled(Boolean isTimeTrackingEnabled) {
        this.isTimeTrackingEnabled = isTimeTrackingEnabled;
    }

}
