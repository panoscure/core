
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class ValidateAWagerV1Model {

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
    private List<Integer> paidDraws = null;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("hasGift")
    @Expose
    private Boolean hasGift;
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
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("payTime")
    @Expose
    private BigInteger payTime;
    @SerializedName("taxationLevel")
    @Expose
    private String taxationLevel;
    @SerializedName("cost")
    @Expose
    private BigDecimal cost;
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

    public List<Integer> getPaidDraws() {
        return paidDraws;
    }

    public void setPaidDraws(List<Integer> paidDraws) {
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

    public Boolean getHasGift() {
        return hasGift;
    }

    public void setHasGift(Boolean hasGift) {
        this.hasGift = hasGift;
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

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public BigInteger getPayTime() {
        return payTime;
    }

    public void setPayTime(BigInteger payTime) {
        this.payTime = payTime;
    }

    public String getTaxationLevel() {
        return taxationLevel;
    }

    public void setTaxationLevel(String taxationLevel) {
        this.taxationLevel = taxationLevel;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
