package com.intralot.qa.automation.core.jira.models.jobprogress;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JobProgressModel {

    @SerializedName("summaryMessage")
    @Expose
    private String summaryMessage;
    @SerializedName("totalSteps")
    @Expose
    private Integer totalSteps;
    @SerializedName("errorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("entityId")
    @Expose
    private String entityId;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("completedSteps")
    @Expose
    private Integer completedSteps;
    @SerializedName("timeTaken")
    @Expose
    private String timeTaken;
    @SerializedName("stepMessage")
    @Expose
    private String stepMessage;
    @SerializedName("progress")
    @Expose
    private Double progress;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("stepLabel")
    @Expose
    private String stepLabel;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("stepMessages")
    @Expose
    private List<Object> stepMessages = null;

    @SerializedName("zipped")
    @Expose
    private String zipped;

    public String getZipped() {
        return zipped;
    }
    public void setZipped(String zipped) {
        this.zipped = zipped;
    }

    public String getSummaryMessage() {
        return summaryMessage;
    }

    public void setSummaryMessage(String summaryMessage) {
        this.summaryMessage = summaryMessage;
    }

    public Integer getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCompletedSteps() {
        return completedSteps;
    }

    public void setCompletedSteps(Integer completedSteps) {
        this.completedSteps = completedSteps;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getStepMessage() {
        return stepMessage;
    }

    public void setStepMessage(String stepMessage) {
        this.stepMessage = stepMessage;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStepLabel() {
        return stepLabel;
    }

    public void setStepLabel(String stepLabel) {
        this.stepLabel = stepLabel;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public List<Object> getStepMessages() {
        return stepMessages;
    }

    public void setStepMessages(List<Object> stepMessages) {
        this.stepMessages = stepMessages;
    }
}
