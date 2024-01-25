
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lotto {

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
    private List<PredefinedInfo> predefinedInfo = null;

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

    public List<PredefinedInfo> getPredefinedInfo() {
        return predefinedInfo;
    }

    public void setPredefinedInfo(List<PredefinedInfo> predefinedInfo) {
        this.predefinedInfo = predefinedInfo;
    }

}
