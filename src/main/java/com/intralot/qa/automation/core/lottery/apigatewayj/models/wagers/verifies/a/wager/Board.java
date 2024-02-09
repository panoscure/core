
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.verifies.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Board {

    @SerializedName("boardId")
    @Expose
    private Integer boardId;
    @SerializedName("betType")
    @Expose
    private Integer betType;
    @SerializedName("multipliers")
    @Expose
    private List<Integer> multipliers = null;
    @SerializedName("panels")
    @Expose
    private List<Panel> panels = null;
    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getBetType() {
        return betType;
    }

    public void setBetType(Integer betType) {
        this.betType = betType;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
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

}