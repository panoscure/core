
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id.WagerOptions;

import java.math.BigInteger;
import java.util.List;

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
    private double cost;
    @SerializedName("creationTime")
    @Expose
    private BigInteger creationTime;
    @SerializedName("updatedTime")
    @Expose
    private BigInteger updatedTime;
    @SerializedName("discount")
    @Expose
    private double discount;
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
    @SerializedName("quickPick")
    @Expose
    private boolean quickPick;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionsType")
    @Expose
    private int selectionsType;
    @SerializedName("wagerOptions")
    @Expose
    private WagerOptions wagerOptions;
    @SerializedName("options")
    @Expose
    private List<String> options = null;
    @SerializedName("teamShares")
    @Expose
    private Integer teamShares;

    public Integer getTeamShares() {
        return teamShares;
    }

    public void setTeamShares(Integer teamShares) {
        this.teamShares = teamShares;
    }

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Boolean getPrimary() {
        return isPrimary;
    }

    public void setPrimary(Boolean primary) {
        isPrimary = primary;
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

    public boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(boolean quickPick) {
        this.quickPick = quickPick;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSelectionsType() {
        return selectionsType;
    }

    public void setSelectionsType(int selectionsType) {
        this.selectionsType = selectionsType;
    }

    public WagerOptions getWagerOptions() {
        return wagerOptions;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
