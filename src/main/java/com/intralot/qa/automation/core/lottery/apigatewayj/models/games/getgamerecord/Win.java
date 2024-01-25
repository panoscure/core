
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Win {

    @SerializedName("algorithm")
    @Expose
    private String algorithm;
    @SerializedName("bets")
    @Expose
    private List<Long> bets = null;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("distributionPercentage")
    @Expose
    private Double distributionPercentage;
    @SerializedName("fixAmount")
    @Expose
    private Object fixAmount;
    @SerializedName("highWinners")
    @Expose
    private Boolean highWinners;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("jackpotConfiguration")
    @Expose
    private JackpotConfiguration jackpotConfiguration;
    @SerializedName("promotionId")
    @Expose
    private Object promotionId;
    @SerializedName("categoryTypeId")
    @Expose
    private Long categoryTypeId;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<Long> getBets() {
        return bets;
    }

    public void setBets(List<Long> bets) {
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

    public Double getDistributionPercentage() {
        return distributionPercentage;
    }

    public void setDistributionPercentage(Double distributionPercentage) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Long categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

}
