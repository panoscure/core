package com.intralot.qa.automation.core.jira.models.executesearch;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Execution {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("cycleId")
    @Expose
    private Integer cycleId;
    @SerializedName("cycleName")
    @Expose
    private String cycleName;
    @SerializedName("issueId")
    @Expose
    private String issueId;
    @SerializedName("issueKey")
    @Expose
    private String issueKey;
    @SerializedName("issueSummary")
    @Expose
    private String issueSummary;
    @SerializedName("labels")
    @Expose
    private List<String> labels = null;
    @SerializedName("issueDescription")
    @Expose
    private String issueDescription;
    @SerializedName("projectKey")
    @Expose
    private String projectKey;
    @SerializedName("projectId")
    @Expose
    private Integer projectId;
    @SerializedName("project")
    @Expose
    private String project;
    @SerializedName("projectAvatarId")
    @Expose
    private Integer projectAvatarId;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("components")
    @Expose
    private List<Component> components = null;
    @SerializedName("versionId")
    @Expose
    private Integer versionId;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("executedOn")
    @Expose
    private String executedOn;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("htmlComment")
    @Expose
    private String htmlComment;
    @SerializedName("executedBy")
    @Expose
    private String executedBy;
    @SerializedName("executedByUserName")
    @Expose
    private String executedByUserName;
    @SerializedName("executionDefects")
    @Expose
    private List<Object> executionDefects = null;
    @SerializedName("stepDefects")
    @Expose
    private List<Object> stepDefects = null;
    @SerializedName("testDefectsUnMasked")
    @Expose
    private List<Object> testDefectsUnMasked = null;
    @SerializedName("stepDefectsUnMasked")
    @Expose
    private List<Object> stepDefectsUnMasked = null;
    @SerializedName("executionDefectCount")
    @Expose
    private Integer executionDefectCount;
    @SerializedName("stepDefectCount")
    @Expose
    private Integer stepDefectCount;
    @SerializedName("totalDefectCount")
    @Expose
    private Integer totalDefectCount;
    @SerializedName("executedByDisplay")
    @Expose
    private String executedByDisplay;
    @SerializedName("assignee")
    @Expose
    private String assignee;
    @SerializedName("assigneeUserName")
    @Expose
    private String assigneeUserName;
    @SerializedName("assigneeDisplay")
    @Expose
    private String assigneeDisplay;
    @SerializedName("canViewIssue")
    @Expose
    private Boolean canViewIssue;
    @SerializedName("folderId")
    @Expose
    private Integer folderId;
    @SerializedName("folderName")
    @Expose
    private String folderName;

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

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public void setIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Integer getProjectAvatarId() {
        return projectAvatarId;
    }

    public void setProjectAvatarId(Integer projectAvatarId) {
        this.projectAvatarId = projectAvatarId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getExecutedOn() {
        return executedOn;
    }

    public void setExecutedOn(String executedOn) {
        this.executedOn = executedOn;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
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

    public String getExecutedBy() {
        return executedBy;
    }

    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    public String getExecutedByUserName() {
        return executedByUserName;
    }

    public void setExecutedByUserName(String executedByUserName) {
        this.executedByUserName = executedByUserName;
    }

    public List<Object> getExecutionDefects() {
        return executionDefects;
    }

    public void setExecutionDefects(List<Object> executionDefects) {
        this.executionDefects = executionDefects;
    }

    public List<Object> getStepDefects() {
        return stepDefects;
    }

    public void setStepDefects(List<Object> stepDefects) {
        this.stepDefects = stepDefects;
    }

    public List<Object> getTestDefectsUnMasked() {
        return testDefectsUnMasked;
    }

    public void setTestDefectsUnMasked(List<Object> testDefectsUnMasked) {
        this.testDefectsUnMasked = testDefectsUnMasked;
    }

    public List<Object> getStepDefectsUnMasked() {
        return stepDefectsUnMasked;
    }

    public void setStepDefectsUnMasked(List<Object> stepDefectsUnMasked) {
        this.stepDefectsUnMasked = stepDefectsUnMasked;
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

    public String getExecutedByDisplay() {
        return executedByDisplay;
    }

    public void setExecutedByDisplay(String executedByDisplay) {
        this.executedByDisplay = executedByDisplay;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getAssigneeUserName() {
        return assigneeUserName;
    }

    public void setAssigneeUserName(String assigneeUserName) {
        this.assigneeUserName = assigneeUserName;
    }

    public String getAssigneeDisplay() {
        return assigneeDisplay;
    }

    public void setAssigneeDisplay(String assigneeDisplay) {
        this.assigneeDisplay = assigneeDisplay;
    }

    public Boolean getCanViewIssue() {
        return canViewIssue;
    }

    public void setCanViewIssue(Boolean canViewIssue) {
        this.canViewIssue = canViewIssue;
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

}