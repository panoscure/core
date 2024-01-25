package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Keno {

    @SerializedName("bet")
    @Expose
    private Bet bet;
    @SerializedName("win")
    @Expose
    private List<Win> win = null;
    @SerializedName("multiJuristictional")
    @Expose
    private Object multiJuristictional;
    @SerializedName("predefinedInfo")
    @Expose
    private Object predefinedInfo;

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public List<Win> getWin() {
        return win;
    }

    public void setWin(List<Win> win) {
        this.win = win;
    }

    public Object getMultiJuristictional() {
        return multiJuristictional;
    }

    public void setMultiJuristictional(Object multiJuristictional) {
        this.multiJuristictional = multiJuristictional;
    }

    public Object getPredefinedInfo() {
        return predefinedInfo;
    }

    public void setPredefinedInfo(Object predefinedInfo) {
        this.predefinedInfo = predefinedInfo;
    }

}
