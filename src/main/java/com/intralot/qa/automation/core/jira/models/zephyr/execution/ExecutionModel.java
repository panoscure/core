package com.intralot.qa.automation.core.jira.models.zephyr.execution;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExecutionModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("executionStatus")
    @Expose
    private String executionStatus;
    @SerializedName("executionWorkflowStatus")
    @Expose
    private Object executionWorkflowStatus;
    @SerializedName("executedOn")
    @Expose
    private String executedOn;
    @SerializedName("executedOnVal")
    @Expose
    private Long executedOnVal;
    @SerializedName("executedBy")
    @Expose
    private String executedBy;
    @SerializedName("executedByDisplay")
    @Expose
    private String executedByDisplay;
    @SerializedName("defects")
    @Expose
    private List<Defect> defects = null;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("htmlComment")
    @Expose
    private String htmlComment;
    @SerializedName("cycleId")
    @Expose
    private Integer cycleId;
    @SerializedName("cycleName")
    @Expose
    private String cycleName;
    @SerializedName("folderId")
    @Expose
    private Integer folderId;
    @SerializedName("folderName")
    @Expose
    private String folderName;
    @SerializedName("versionId")
    @Expose
    private Integer versionId;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("projectId")
    @Expose
    private Integer projectId;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("createdByDisplay")
    @Expose
    private String createdByDisplay;
    @SerializedName("createdByUserName")
    @Expose
    private String createdByUserName;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("createdOn")
    @Expose
    private String createdOn;
    @SerializedName("createdOnVal")
    @Expose
    private Long createdOnVal;
    @SerializedName("issueId")
    @Expose
    private Integer issueId;
    @SerializedName("issueKey")
    @Expose
    private String issueKey;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("issueDescription")
    @Expose
    private String issueDescription;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("component")
    @Expose
    private String component;
    @SerializedName("projectKey")
    @Expose
    private String projectKey;
    @SerializedName("canViewIssue")
    @Expose
    private Boolean canViewIssue;
    @SerializedName("isIssueEstimateNil")
    @Expose
    private Boolean isIssueEstimateNil;
    @SerializedName("isExecutionWorkflowEnabled")
    @Expose
    private Boolean isExecutionWorkflowEnabled;
    @SerializedName("isTimeTrackingEnabled")
    @Expose
    private Boolean isTimeTrackingEnabled;
    @SerializedName("executionDefectCount")
    @Expose
    private Integer executionDefectCount;
    @SerializedName("stepDefectCount")
    @Expose
    private Integer stepDefectCount;
    @SerializedName("totalDefectCount")
    @Expose
    private Integer totalDefectCount;
    @SerializedName("executionSummaries")
    @Expose
    private String executionSummaries;
    @SerializedName("totalExecutions")
    @Expose
    private Integer totalExecutions;
    @SerializedName("totalExecuted")
    @Expose
    private Integer totalExecuted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    public Object getExecutionWorkflowStatus() {
        return executionWorkflowStatus;
    }

    public void setExecutionWorkflowStatus(Object executionWorkflowStatus) {
        this.executionWorkflowStatus = executionWorkflowStatus;
    }

    public String getExecutedOn() {
        return executedOn;
    }

    public void setExecutedOn(String executedOn) {
        this.executedOn = executedOn;
    }

    public Long getExecutedOnVal() {
        return executedOnVal;
    }

    public void setExecutedOnVal(Long executedOnVal) {
        this.executedOnVal = executedOnVal;
    }

    public String getExecutedBy() {
        return executedBy;
    }

    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    public String getExecutedByDisplay() {
        return executedByDisplay;
    }

    public void setExecutedByDisplay(String executedByDisplay) {
        this.executedByDisplay = executedByDisplay;
    }

    public List<Defect> getDefects() {
        return defects;
    }

    public void setDefects(List<Defect> defects) {
        this.defects = defects;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHtmlComment() {
        return htmlComment;
    }

    public void setHtmlComment(String htmlComment) {
        this.htmlComment = htmlComment;
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

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByDisplay() {
        return createdByDisplay;
    }

    public void setCreatedByDisplay(String createdByDisplay) {
        this.createdByDisplay = createdByDisplay;
    }

    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedOnVal() {
        return createdOnVal;
    }

    public void setCreatedOnVal(Long createdOnVal) {
        this.createdOnVal = createdOnVal;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Boolean getCanViewIssue() {
        return canViewIssue;
    }

    public void setCanViewIssue(Boolean canViewIssue) {
        this.canViewIssue = canViewIssue;
    }

    public Boolean getIsIssueEstimateNil() {
        return isIssueEstimateNil;
    }

    public void setIsIssueEstimateNil(Boolean isIssueEstimateNil) {
        this.isIssueEstimateNil = isIssueEstimateNil;
    }

    public Boolean getIsExecutionWorkflowEnabled() {
        return isExecutionWorkflowEnabled;
    }

    public void setIsExecutionWorkflowEnabled(Boolean isExecutionWorkflowEnabled) {
        this.isExecutionWorkflowEnabled = isExecutionWorkflowEnabled;
    }

    public Boolean getIsTimeTrackingEnabled() {
        return isTimeTrackingEnabled;
    }

    public void setIsTimeTrackingEnabled(Boolean isTimeTrackingEnabled) {
        this.isTimeTrackingEnabled = isTimeTrackingEnabled;
    }

    public Integer getExecutionDefectCount() {
        return executionDefectCount;
    }

    public void setExecutionDefectCount(Integer executionDefectCount) {
        this.executionDefectCount = executionDefectCount;
    }

    public Integer getStepDefectCount() {
        return stepDefectCount;
    }

    public void setStepDefectCount(Integer stepDefectCount) {
        this.stepDefectCount = stepDefectCount;
    }

    public Integer getTotalDefectCount() {
        return totalDefectCount;
    }

    public void setTotalDefectCount(Integer totalDefectCount) {
        this.totalDefectCount = totalDefectCount;
    }

    public String getExecutionSummaries() {
        return executionSummaries;
    }

    public void setExecutionSummaries(String executionSummaries) {
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
}
