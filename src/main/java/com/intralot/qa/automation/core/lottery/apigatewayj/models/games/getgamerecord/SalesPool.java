
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SalesPool {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("descr")
    @Expose
    private String descr;
    @SerializedName("distributionPercentage")
    @Expose
    private Double distributionPercentage;
    @SerializedName("distributionType")
    @Expose
    private String distributionType;
    @SerializedName("participatedGameTypes")
    @Expose
    private List<Long> participatedGameTypes = null;
    @SerializedName("distributionTypeId")
    @Expose
    private Long distributionTypeId;
    @SerializedName("operators")
    @Expose
    private List<Long> operators = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Double getDistributionPercentage() {
        return distributionPercentage;
    }

    public void setDistributionPercentage(Double distributionPercentage) {
        this.distributionPercentage = distributionPercentage;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

    public List<Long> getParticipatedGameTypes() {
        return participatedGameTypes;
    }

    public void setParticipatedGameTypes(List<Long> participatedGameTypes) {
        this.participatedGameTypes = participatedGameTypes;
    }

    public Long getDistributionTypeId() {
        return distributionTypeId;
    }

    public void setDistributionTypeId(Long distributionTypeId) {
        this.distributionTypeId = distributionTypeId;
    }

    public List<Long> getOperators() {
        return operators;
    }

    public void setOperators(List<Long> operators) {
        this.operators = operators;
    }

}
