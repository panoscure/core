
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Board {

    @SerializedName("betType")
    @Expose
    private Integer betType;
    @SerializedName("boardId")
    @Expose
    private Integer boardId;
    @SerializedName("multipliers")
    @Expose
    private List<Integer> multipliers = null;
    @SerializedName("options")
    @Expose
    private List<String> options = null;
    @SerializedName("panels")
    @Expose
    private List<Panel> panels = null;
    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;
    @SerializedName("systemId")
    @Expose
    private Integer systemId;
    @SerializedName("extendedBetting")
    @Expose
    private ExtendedBetting extendedBetting;

    public Integer getBetType() {
        return betType;
    }

    public void setBetType(Integer betType) {
        this.betType = betType;
    }

    public Board withBetType(Integer betType) {
        this.betType = betType;
        return this;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Board withBoardId(Integer boardId) {
        this.boardId = boardId;
        return this;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }

    public Board withMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
        return this;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Board withOptions(List<String> options) {
        this.options = options;
        return this;
    }

    public List<Panel> getPanels() {
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }

    public Board withPanels(List<Panel> panels) {
        this.panels = panels;
        return this;
    }

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    public Board withQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
        return this;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Board withSystemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    public ExtendedBetting getExtendedBetting() {
        return extendedBetting;
    }

    public void setExtendedBetting(ExtendedBetting extendedBetting) {
        this.extendedBetting = extendedBetting;
    }

    public Board withExtendedBetting(ExtendedBetting extendedBetting) {
        this.extendedBetting = extendedBetting;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("betType", betType).append("boardId", boardId).append("multipliers", multipliers).append("options", options).append("panels", panels).append("quickPick", quickPick).append("systemId", systemId).append("extendedBetting", extendedBetting).toString();
    }

}
