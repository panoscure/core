package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dbg_ {

    @SerializedName("blockStatus")
    @Expose
    private String blockStatus;
    @SerializedName("boards")
    @Expose
    private List<Board> boards = null;
    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("cost")
    @Expose
    private Double cost;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("multipliers")
    @Expose
    private List<Integer> multipliers = null;
    @SerializedName("participatingDraws")
    @Expose
    private ParticipatingDraws participatingDraws;
    @SerializedName("status")
    @Expose
    private String status;

    public String getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }

    public ParticipatingDraws getParticipatingDraws() {
        return participatingDraws;
    }

    public void setParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}