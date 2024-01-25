
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id.WagerOptions;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Dbg {

    @SerializedName("addOn")
    @Expose
    private List<AddOnDbg> addOn = null;
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
    private Integer cost;
    @SerializedName("creationTime")
    @Expose
    private Integer creationTime;
    @SerializedName("updatedTime")
    @Expose
    private Integer updatedTime;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("multipliers")
    @Expose
    private List<Integer> multipliers = null;
    @SerializedName("options")
    @Expose
    private List<String> options = null;
    @SerializedName("participatingDraws")
    @Expose
    private ParticipatingDraws participatingDraws;
    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("teamShares")
    @Expose
    private Integer teamShares;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("selectionsType")
    @Expose
    private Integer selectionsType;
    @SerializedName("wagerOptions")
    @Expose
    private WagerOptions wagerOptions;
    @SerializedName("maxWinnings")
    @Expose
    private Integer maxWinnings;

    public List<AddOnDbg> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOnDbg> addOn) {
        this.addOn = addOn;
    }

    public Dbg withAddOn(List<AddOnDbg> addOn) {
        this.addOn = addOn;
        return this;
    }

    public String getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }

    public Dbg withBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
        return this;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public Dbg withBoards(List<Board> boards) {
        this.boards = boards;
        return this;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Dbg withColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Dbg withCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public Dbg withCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Dbg withUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Dbg withDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Dbg withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }

    public Dbg withMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
        return this;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Dbg withOptions(List<String> options) {
        this.options = options;
        return this;
    }

    public ParticipatingDraws getParticipatingDraws() {
        return participatingDraws;
    }

    public Dbg withParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
        return this;
    }

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    public Dbg withQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Dbg withStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getTeamShares() {
        return teamShares;
    }

    public void setTeamShares(Integer teamShares) {
        this.teamShares = teamShares;
    }

    public Dbg withTeamShares(Integer teamShares) {
        this.teamShares = teamShares;
        return this;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public Dbg withPilot(Boolean pilot) {
        this.pilot = pilot;
        return this;
    }

    public Integer getSelectionsType() {
        return selectionsType;
    }

    public void setSelectionsType(Integer selectionsType) {
        this.selectionsType = selectionsType;
    }

    public Dbg withSelectionsType(Integer selectionsType) {
        this.selectionsType = selectionsType;
        return this;
    }

    public WagerOptions getWagerOptions() {
        return wagerOptions;
    }

    public void setWagerOptions(WagerOptions wagerOptions) {
        this.wagerOptions = wagerOptions;
    }

    public Dbg withWagerOptions(WagerOptions wagerOptions) {
        this.wagerOptions = wagerOptions;
        return this;
    }

    public Integer getMaxWinnings() {
        return maxWinnings;
    }

    public void setMaxWinnings(Integer maxWinnings) {
        this.maxWinnings = maxWinnings;
    }

    public Dbg withMaxWinnings(Integer maxWinnings) {
        this.maxWinnings = maxWinnings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addOn", addOn).append("blockStatus", blockStatus).append("boards", boards).append("columns", columns).append("cost", cost).append("creationTime", creationTime).append("updatedTime", updatedTime).append("discount", discount).append("gameId", gameId).append("multipliers", multipliers).append("options", options).append("participatingDraws", participatingDraws).append("quickPick", quickPick).append("status", status).append("teamShares", teamShares).append("pilot", pilot).append("selectionsType", selectionsType).append("wagerOptions", wagerOptions).append("maxWinnings", maxWinnings).toString();
    }

}
