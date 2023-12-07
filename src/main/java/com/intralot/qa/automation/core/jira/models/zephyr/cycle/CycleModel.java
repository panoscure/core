package com.intralot.qa.automation.core.jira.models.zephyr.cycle;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CycleModel {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("cycleOrderId")
    @Expose
    private Integer cycleOrderId;
    @SerializedName("sprintId")
    @Expose
    private Object sprintId;
    @SerializedName("versionId")
    @Expose
    private Integer versionId;
    @SerializedName("environment")
    @Expose
    private String environment;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("build")
    @Expose
    private String build;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("projectId")
    @Expose
    private Integer projectId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Integer getCycleOrderId() {
        return cycleOrderId;
    }

    public void setCycleOrderId(Integer cycleOrderId) {
        this.cycleOrderId = cycleOrderId;
    }

    public Object getSprintId() {
        return sprintId;
    }

    public void setSprintId(Object sprintId) {
        this.sprintId = sprintId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}