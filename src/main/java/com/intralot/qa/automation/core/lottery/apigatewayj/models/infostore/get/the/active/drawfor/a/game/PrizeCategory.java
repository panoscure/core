package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.the.active.drawfor.a.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrizeCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("divident")
    @Expose
    private float divident;
    @SerializedName("netDividentAmount")
    @Expose
    private float netDividentAmount;
    @SerializedName("winners")
    @Expose
    private Integer winners;
    @SerializedName("distributed")
    @Expose
    private double distributed;
    @SerializedName("jackpot")
    @Expose
    private Double jackpot;
    @SerializedName("bonus")
    @Expose
    private Double bonus;
    @SerializedName("fixed")
    @Expose
    private Double fixed;
    @SerializedName("categoryType")
    @Expose
    private Integer categoryType;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("minimumDistributed")
    @Expose
    private Integer minimumDistributed;

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

    public float getNetDividentAmount() {
        return netDividentAmount;
    }

    public void setNetDividentAmount(float netDividentAmount) {
        this.netDividentAmount = netDividentAmount;
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

    public void setDistributed(double distributed) {
        this.distributed = distributed;
    }

    public Double getJackpot() {
        return jackpot;
    }

    public void setJackpot(Double jackpot) {
        this.jackpot = jackpot;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getFixed() {
        return fixed;
    }

    public void setFixed(Double fixed) {
        this.fixed = fixed;
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

    public Integer getMinimumDistributed() {
        return minimumDistributed;
    }

    public void setMinimumDistributed(Integer minimumDistributed) {
        this.minimumDistributed = minimumDistributed;
    }

}
