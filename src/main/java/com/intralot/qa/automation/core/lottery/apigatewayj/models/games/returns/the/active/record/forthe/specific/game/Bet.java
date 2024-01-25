package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bet {

    @SerializedName("betTypes")
    @Expose
    private List<BetType> betTypes = null;
    @SerializedName("panels")
    @Expose
    private List<Panel> panels = null;
    @SerializedName("systems")
    @Expose
    private Object systems;
    @SerializedName("sideBetPanels")
    @Expose
    private Object sideBetPanels;

    public List<BetType> getBetTypes() {
        return betTypes;
    }

    public void setBetTypes(List<BetType> betTypes) {
        this.betTypes = betTypes;
    }

    public List<Panel> getPanels() {
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }

    public Object getSystems() {
        return systems;
    }

    public void setSystems(Object systems) {
        this.systems = systems;
    }

    public Object getSideBetPanels() {
        return sideBetPanels;
    }

    public void setSideBetPanels(Object sideBetPanels) {
        this.sideBetPanels = sideBetPanels;
    }

}
