
package com.intralot.qa.automation.core.lottery.apigatewayj.models.check.status.of.a.play.request.by.guid;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dbg {

    @SerializedName("addOn")
    @Expose
    private List<AddOn> addOn = null;
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
    private BigDecimal cost;
    @SerializedName("creationTime")
    @Expose
    private BigInteger creationTime;
    @SerializedName("updatedTime")
    @Expose
    private BigInteger updatedTime;
    @SerializedName("discount")
    @Expose
    private BigDecimal discount;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("isPrimary")
    @Expose
    private Boolean isPrimary;
    @SerializedName("multipliers")
    @Expose
    private List<Integer> multipliers = null;
    @SerializedName("participatingDraws")
    @Expose
    private ParticipatingDraws participatingDraws;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionsType")
    @Expose
    private Integer selectionsType;

    public List<AddOn> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOn> addOn) {
        this.addOn = addOn;
    }

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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigInteger getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(BigInteger creationTime) {
        this.creationTime = creationTime;
    }

    public BigInteger getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(BigInteger updatedTime) {
        this.updatedTime = updatedTime;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
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

    public Integer getSelectionsType() {
        return selectionsType;
    }

    public void setSelectionsType(Integer selectionsType) {
        this.selectionsType = selectionsType;
    }

}
