package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SalesPool {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("descr")
    @Expose
    private String descr;
    @SerializedName("distributionPercentage")
    @Expose
    private Integer distributionPercentage;
    @SerializedName("distributionType")
    @Expose
    private String distributionType;
    @SerializedName("participatedGameTypes")
    @Expose
    private List<Integer> participatedGameTypes = null;
    @SerializedName("distributionTypeId")
    @Expose
    private Integer distributionTypeId;
    @SerializedName("operators")
    @Expose
    private List<Integer> operators = null;
    @SerializedName("reserveFundPercentage")
    @Expose
    private Integer reserveFundPercentage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getDistributionPercentage() {
        return distributionPercentage;
    }

    public void setDistributionPercentage(Integer distributionPercentage) {
        this.distributionPercentage = distributionPercentage;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

    public List<Integer> getParticipatedGameTypes() {
        return participatedGameTypes;
    }

    public void setParticipatedGameTypes(List<Integer> participatedGameTypes) {
        this.participatedGameTypes = participatedGameTypes;
    }

    public Integer getDistributionTypeId() {
        return distributionTypeId;
    }

    public void setDistributionTypeId(Integer distributionTypeId) {
        this.distributionTypeId = distributionTypeId;
    }

    public List<Integer> getOperators() {
        return operators;
    }

    public void setOperators(List<Integer> operators) {
        this.operators = operators;
    }

    public Integer getReserveFundPercentage() {
        return reserveFundPercentage;
    }

    public void setReserveFundPercentage(Integer reserveFundPercentage) {
        this.reserveFundPercentage = reserveFundPercentage;
    }

}
