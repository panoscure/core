package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.retrieve.the.players.bets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.BaseModel;

import java.util.List;

public class RetrieveThePlayersBetsModel extends BaseModel {
    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public RetrieveThePlayersBetsModel withAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
        return this;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public RetrieveThePlayersBetsModel withBets(List<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public RetrieveThePlayersBetsModel withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public RetrieveThePlayersBetsModel withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}