
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bet {

    @SerializedName("addOnPanels")
    @Expose
    private int addOnPanels;
    @SerializedName("matchesForRefund")
    @Expose
    private int matchesForRefund;
    @SerializedName("panels")
    @Expose
    private List<Panel> panels = null;
    @SerializedName("symbols")
    @Expose
    private Symbols symbols;
    @SerializedName("betTypes")
    @Expose
    private List<BetType> betTypes = null;
    @SerializedName("systems")
    @Expose
    private Object systems;

    public int getAddOnPanels() {
        return addOnPanels;
    }

    public void setAddOnPanels(int addOnPanels) {
        this.addOnPanels = addOnPanels;
    }

    public int getMatchesForRefund() {
        return matchesForRefund;
    }

    public void setMatchesForRefund(int matchesForRefund) {
        this.matchesForRefund = matchesForRefund;
    }

    public List<Panel> getPanels() {
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public List<BetType> getBetTypes() {
        return betTypes;
    }

    public void setBetTypes(List<BetType> betTypes) {
        this.betTypes = betTypes;
    }

    public Object getSystems() {
        return systems;
    }

    public void setSystems(Object systems) {
        this.systems = systems;
    }
}
