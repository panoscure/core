package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Board {

    @SerializedName("betType")
    @Expose
    private Integer betType;
    @SerializedName("boardId")
    @Expose
    private Integer boardId;
    @SerializedName("panels")
    @Expose
    private List<Panel> panels;
    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;

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