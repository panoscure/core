
package com.intralot.qa.automation.core.lottery.apigatewayj.models.draw.operations.v3_1.get.drawv3_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrizeCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("divident")
    @Expose
    private Double divident;
    @SerializedName("winners")
    @Expose
    private Integer winners;
    @SerializedName("distributed")
    @Expose
    private Double distributed;
    @SerializedName("jackpot")
    @Expose
    private Double jackpot;
    @SerializedName("categoryType")
    @Expose
    private Integer categoryType;
    @SerializedName("gameType")
    @Expose
    private String gameType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDivident() {
        return divident;
    }

    public void setDivident(Double divident) {
        this.divident = divident;
    }

    public Integer getWinners() {
        return winners;
    }

    public void setWinners(Integer winners) {
        this.winners = winners;
    }

    public Double getDistributed() {
        return distributed;
    }

    public void setDistributed(Double distributed) {
        this.distributed = distributed;
    }

    public Double getJackpot() {
        return jackpot;
    }

    public void setJackpot(Double jackpot) {
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

}
