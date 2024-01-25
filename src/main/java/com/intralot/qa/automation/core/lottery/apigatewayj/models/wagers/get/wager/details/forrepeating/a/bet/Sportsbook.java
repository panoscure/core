
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sportsbook {

    @SerializedName("acceptOdds")
    @Expose
    private Integer acceptOdds;
    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("betSlipId")
    @Expose
    private Integer betSlipId;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("employeeId")
    @Expose
    private Integer employeeId;
    @SerializedName("freeBets")
    @Expose
    private List<FreeBet> freeBets = null;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("multifactor")
    @Expose
    private Integer multifactor;
    @SerializedName("placedTime")
    @Expose
    private Integer placedTime;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("sumOfStake")
    @Expose
    private Integer sumOfStake;
    @SerializedName("sumOfPayout")
    @Expose
    private Integer sumOfPayout;
    @SerializedName("sumOfBonusWinnings")
    @Expose
    private Integer sumOfBonusWinnings;
    @SerializedName("sumOfTotalCost")
    @Expose
    private Integer sumOfTotalCost;
    @SerializedName("result")
    @Expose
    private Result result;
    @SerializedName("extBetslipId")
    @Expose
    private String extBetslipId;

    public Integer getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(Integer acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Integer getBetSlipId() {
        return betSlipId;
    }

    public void setBetSlipId(Integer betSlipId) {
        this.betSlipId = betSlipId;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public List<FreeBet> getFreeBets() {
        return freeBets;
    }

    public void setFreeBets(List<FreeBet> freeBets) {
        this.freeBets = freeBets;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getMultifactor() {
        return multifactor;
    }

    public void setMultifactor(Integer multifactor) {
        this.multifactor = multifactor;
    }

    public Integer getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(Integer placedTime) {
        this.placedTime = placedTime;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getSumOfStake() {
        return sumOfStake;
    }

    public void setSumOfStake(Integer sumOfStake) {
        this.sumOfStake = sumOfStake;
    }

    public Integer getSumOfPayout() {
        return sumOfPayout;
    }

    public void setSumOfPayout(Integer sumOfPayout) {
        this.sumOfPayout = sumOfPayout;
    }

    public Integer getSumOfBonusWinnings() {
        return sumOfBonusWinnings;
    }

    public void setSumOfBonusWinnings(Integer sumOfBonusWinnings) {
        this.sumOfBonusWinnings = sumOfBonusWinnings;
    }

    public Integer getSumOfTotalCost() {
        return sumOfTotalCost;
    }

    public void setSumOfTotalCost(Integer sumOfTotalCost) {
        this.sumOfTotalCost = sumOfTotalCost;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getExtBetslipId() {
        return extBetslipId;
    }

    public void setExtBetslipId(String extBetslipId) {
        this.extBetslipId = extBetslipId;
    }

}
