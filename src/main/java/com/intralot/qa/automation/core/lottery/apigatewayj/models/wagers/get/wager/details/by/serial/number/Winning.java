
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Winning {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("totalAmounts")
    @Expose
    private TotalAmounts totalAmounts;
    @SerializedName("startDraw")
    @Expose
    private Integer startDraw;
    @SerializedName("endDraw")
    @Expose
    private Integer endDraw;
    @SerializedName("paidDraws")
    @Expose
    private List<Object> paidDraws = null;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("blockingStatus")
    @Expose
    private String blockingStatus;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;
    @SerializedName("highWinner")
    @Expose
    private Boolean highWinner;
    @SerializedName("noReceipt")
    @Expose
    private Boolean noReceipt;
    @SerializedName("playedDraw")
    @Expose
    private Integer playedDraw;
    @SerializedName("teamShares")
    @Expose
    private Integer teamShares;
    @SerializedName("taxationLevel")
    @Expose
    private Integer taxationLevel;
    @SerializedName("cost")
    @Expose
    private double cost;
    @SerializedName("saleRetailerId")
    @Expose
    private Integer saleRetailerId;
    @SerializedName("saleChannel")
    @Expose
    private Integer saleChannel;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public TotalAmounts getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(TotalAmounts totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public Integer getStartDraw() {
        return startDraw;
    }

    public void setStartDraw(Integer startDraw) {
        this.startDraw = startDraw;
    }

    public Integer getEndDraw() {
        return endDraw;
    }

    public void setEndDraw(Integer endDraw) {
        this.endDraw = endDraw;
    }

    public List<Object> getPaidDraws() {
        return paidDraws;
    }

    public void setPaidDraws(List<Object> paidDraws) {
        this.paidDraws = paidDraws;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBlockingStatus() {
        return blockingStatus;
    }

    public void setBlockingStatus(String blockingStatus) {
        this.blockingStatus = blockingStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Boolean getHighWinner() {
        return highWinner;
    }

    public void setHighWinner(Boolean highWinner) {
        this.highWinner = highWinner;
    }

    public Boolean getNoReceipt() {
        return noReceipt;
    }

    public void setNoReceipt(Boolean noReceipt) {
        this.noReceipt = noReceipt;
    }

    public Integer getPlayedDraw() {
        return playedDraw;
    }

    public void setPlayedDraw(Integer playedDraw) {
        this.playedDraw = playedDraw;
    }

    public Integer getTeamShares() {
        return teamShares;
    }

    public void setTeamShares(Integer teamShares) {
        this.teamShares = teamShares;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getTaxationLevel() {
        return taxationLevel;
    }

    public void setTaxationLevel(Integer taxationLevel) {
        this.taxationLevel = taxationLevel;
    }

    public Integer getSaleRetailerId() {
        return saleRetailerId;
    }

    public void setSaleRetailerId(Integer saleRetailerId) {
        this.saleRetailerId = saleRetailerId;
    }

    public Integer getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(Integer saleChannel) {
        this.saleChannel = saleChannel;
    }

}
