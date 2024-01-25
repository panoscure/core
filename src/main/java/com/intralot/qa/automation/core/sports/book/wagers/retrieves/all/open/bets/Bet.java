package com.intralot.qa.automation.core.sports.book.wagers.retrieves.all.open.bets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Modifier;
import java.util.List;

public class Bet {
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("system")
    @Expose
    private java.lang.System system;
    @SerializedName("winType")
    @Expose
    private String winType;
    @SerializedName("potentialPayout")
    @Expose
    private Double potentialPayout;
    @SerializedName("betId")
    @Expose
    private Long betId;
    @SerializedName("betNo")
    @Expose
    private Integer betNo;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("liveBet")
    @Expose
    private Boolean liveBet;
    @SerializedName("totalPrice")
    @Expose
    private Double totalPrice;
    @SerializedName("betTime")
    @Expose
    private Long betTime;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;
    @SerializedName("bonusWinnings")
    @Expose
    private Double bonusWinnings;
    @SerializedName("freeBet")
    @Expose
    private Boolean freeBet;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private Double potentialBonusWinnings;
    @SerializedName("extBetId")
    @Expose
    private String extBetId;
    @SerializedName("partialCashoutBetIds")
    @Expose
    private List<Object> partialCashoutBetIds = null;
    @SerializedName("refund")
    @Expose
    private Integer refund;
    @SerializedName("buildABet")
    @Expose
    private Boolean buildABet;
    @SerializedName("currentlyInplay")
    @Expose
    private Boolean currentlyInplay;

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Bet withSelections(List<Selection> selections) {
        this.selections = selections;
        return this;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public Bet withStake(Stake stake) {
        this.stake = stake;
        return this;
    }

    public java.lang.System getSystem() {
        return system;
    }

    public void setSystem(java.lang.System system) {
        this.system = system;
    }

    public Bet withSystem(java.lang.System system) {
        this.system = system;
        return this;
    }

    public String getWinType() {
        return winType;
    }

    public void setWinType(String winType) {
        this.winType = winType;
    }

    public Bet withWinType(String winType) {
        this.winType = winType;
        return this;
    }

    public Double getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(Double potentialPayout) {
        this.potentialPayout = potentialPayout;
    }

    public Bet withPotentialPayout(Double potentialPayout) {
        this.potentialPayout = potentialPayout;
        return this;
    }

    public Long getBetId() {
        return betId;
    }

    public void setBetId(Long betId) {
        this.betId = betId;
    }

    public Bet withBetId(Long betId) {
        this.betId = betId;
        return this;
    }

    public Integer getBetNo() {
        return betNo;
    }

    public void setBetNo(Integer betNo) {
        this.betNo = betNo;
    }

    public Bet withBetNo(Integer betNo) {
        this.betNo = betNo;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bet withStatus(String status) {
        this.status = status;
        return this;
    }

    public Boolean getLiveBet() {
        return liveBet;
    }

    public void setLiveBet(Boolean liveBet) {
        this.liveBet = liveBet;
    }

    public Bet withLiveBet(Boolean liveBet) {
        this.liveBet = liveBet;
        return this;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Bet withTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Long getBetTime() {
        return betTime;
    }

    public void setBetTime(Long betTime) {
        this.betTime = betTime;
    }

    public Bet withBetTime(Long betTime) {
        this.betTime = betTime;
        return this;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Bet withChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    public Double getBonusWinnings() {
        return bonusWinnings;
    }

    public void setBonusWinnings(Double bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
    }

    public Bet withBonusWinnings(Double bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
        return this;
    }

    public Boolean getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Boolean freeBet) {
        this.freeBet = freeBet;
    }

    public Bet withFreeBet(Boolean freeBet) {
        this.freeBet = freeBet;
        return this;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public Bet withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    public Double getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(Double potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
    }

    public Bet withPotentialBonusWinnings(Double potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
        return this;
    }

    public String getExtBetId() {
        return extBetId;
    }

    public void setExtBetId(String extBetId) {
        this.extBetId = extBetId;
    }

    public Bet withExtBetId(String extBetId) {
        this.extBetId = extBetId;
        return this;
    }

    public List<Object> getPartialCashoutBetIds() {
        return partialCashoutBetIds;
    }

    public void setPartialCashoutBetIds(List<Object> partialCashoutBetIds) {
        this.partialCashoutBetIds = partialCashoutBetIds;
    }

    public Bet withPartialCashoutBetIds(List<Object> partialCashoutBetIds) {
        this.partialCashoutBetIds = partialCashoutBetIds;
        return this;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    public Bet withRefund(Integer refund) {
        this.refund = refund;
        return this;
    }

    public Boolean getBuildABet() {
        return buildABet;
    }

    public void setBuildABet(Boolean buildABet) {
        this.buildABet = buildABet;
    }

    public Bet withBuildABet(Boolean buildABet) {
        this.buildABet = buildABet;
        return this;
    }

    public Boolean getCurrentlyInplay() {
        return currentlyInplay;
    }

    public void setCurrentlyInplay(Boolean currentlyInplay) {
        this.currentlyInplay = currentlyInplay;
    }

    public Bet withCurrentlyInplay(Boolean currentlyInplay) {
        this.currentlyInplay = currentlyInplay;
        return this;
    }

    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }
}