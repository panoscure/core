package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Win {

    @SerializedName("algorithm")
    @Expose
    private String algorithm;
    @SerializedName("bets")
    @Expose
    private List<Integer> bets = null;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("distributionPercentage")
    @Expose
    private Integer distributionPercentage;
    @SerializedName("fixAmount")
    @Expose
    private Object fixAmount;
    @SerializedName("highWinners")
    @Expose
    private Boolean highWinners;
    @SerializedName("eliminateLower")
    @Expose
    private Boolean eliminateLower;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("annuity")
    @Expose
    private Boolean annuity;
    @SerializedName("jackpotConfiguration")
    @Expose
    private JackpotConfiguration jackpotConfiguration;
    @SerializedName("promotionId")
    @Expose
    private Object promotionId;
    @SerializedName("categoryTypeId")
    @Expose
    private Integer categoryTypeId;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<Integer> getBets() {
        return bets;
    }

    public void setBets(List<Integer> bets) {
        this.bets = bets;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDistributionPercentage() {
        return distributionPercentage;
    }

    public void setDistributionPercentage(Integer distributionPercentage) {
        this.distributionPercentage = distributionPercentage;
    }

    public Object getFixAmount() {
        return fixAmount;
    }

    public void setFixAmount(Object fixAmount) {
        this.fixAmount = fixAmount;
    }

    public Boolean getHighWinners() {
        return highWinners;
    }

    public void setHighWinners(Boolean highWinners) {
        this.highWinners = highWinners;
    }

    public Boolean getEliminateLower() {
        return eliminateLower;
    }

    public void setEliminateLower(Boolean eliminateLower) {
        this.eliminateLower = eliminateLower;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAnnuity() {
        return annuity;
    }

    public void setAnnuity(Boolean annuity) {
        this.annuity = annuity;
    }

    public JackpotConfiguration getJackpotConfiguration() {
        return jackpotConfiguration;
    }

    public void setJackpotConfiguration(JackpotConfiguration jackpotConfiguration) {
        this.jackpotConfiguration = jackpotConfiguration;
    }

    public Object getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Object promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

}
