package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.active.draws;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrizeCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("divident")
    @Expose
    private float divident;
    @SerializedName("winners")
    @Expose
    private Integer winners;
    @SerializedName("distributed")
    @Expose
    private float distributed;
    @SerializedName("jackpot")
    @Expose
    private float jackpot;
    @SerializedName("categoryType")
    @Expose
    private Integer categoryType;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("fixed")
    @Expose
    private float fixed;
    @SerializedName("minimumDistributed")
    @Expose
    private Integer minimumDistributed;
    @SerializedName("promotionId")
    @Expose
    private Integer promotionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getDivident() {
        return divident;
    }

    public void setDivident(float divident) {
        this.divident = divident;
    }

    public Integer getWinners() {
        return winners;
    }

    public void setWinners(Integer winners) {
        this.winners = winners;
    }

    public double getDistributed() {
        return distributed;
    }

    public void setDistributed(float distributed) {
        this.distributed = distributed;
    }

    public float getJackpot() {
        return jackpot;
    }

    public void setJackpot(float jackpot) {
        this.jackpot = jackpot;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public float getFixed() {
        return fixed;
    }

    public void setFixed(float fixed) {
        this.fixed = fixed;
    }

    public Integer getMinimumDistributed() {
        return minimumDistributed;
    }

    public void setMinimumDistributed(Integer minimumDistributed) {
        this.minimumDistributed = minimumDistributed;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

}