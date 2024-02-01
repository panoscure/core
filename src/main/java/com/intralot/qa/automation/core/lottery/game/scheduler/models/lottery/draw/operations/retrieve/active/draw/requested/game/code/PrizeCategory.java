package com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrizeCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("distributedAmount")
    @Expose
    private Double distributedAmount;
    @SerializedName("dividentAmount")
    @Expose
    private Double dividentAmount;
    @SerializedName("taxationAmount")
    @Expose
    private Double taxationAmount;
    @SerializedName("roundingAmount")
    @Expose
    private Double roundingAmount;
    @SerializedName("bonusAmount")
    @Expose
    private Double bonusAmount;
    @SerializedName("jackpotAmount")
    @Expose
    private Double jackpotAmount;
    @SerializedName("netDividentAmount")
    @Expose
    private Double netDividentAmount;
    @SerializedName("winners")
    @Expose
    private Integer winners;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDistributedAmount() {
        return distributedAmount;
    }

    public void setDistributedAmount(Double distributedAmount) {
        this.distributedAmount = distributedAmount;
    }

    public Double getDividentAmount() {
        return dividentAmount;
    }

    public void setDividentAmount(Double dividentAmount) {
        this.dividentAmount = dividentAmount;
    }

    public Double getTaxationAmount() {
        return taxationAmount;
    }

    public void setTaxationAmount(Double taxationAmount) {
        this.taxationAmount = taxationAmount;
    }

    public Double getRoundingAmount() {
        return roundingAmount;
    }

    public void setRoundingAmount(Double roundingAmount) {
        this.roundingAmount = roundingAmount;
    }

    public Double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public Double getJackpotAmount() {
        return jackpotAmount;
    }

    public void setJackpotAmount(Double jackpotAmount) {
        this.jackpotAmount = jackpotAmount;
    }

    public Double getNetDividentAmount() {
        return netDividentAmount;
    }

    public void setNetDividentAmount(Double netDividentAmount) {
        this.netDividentAmount = netDividentAmount;
    }

    public Integer getWinners() {
        return winners;
    }

    public void setWinners(Integer winners) {
        this.winners = winners;
    }

}
