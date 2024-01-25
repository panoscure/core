
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Panel> getPanels() {
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public ExtendedBetting getExtendedBetting() {
        return extendedBetting;
    }

    public void setExtendedBetting(ExtendedBetting extendedBetting) {
        this.extendedBetting = extendedBetting;
    }

}
