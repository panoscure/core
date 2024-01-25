
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Matchx {

    @SerializedName("bet")
    @Expose
    private Bet bet;
    @SerializedName("win")
    @Expose
    private List<Win> win = null;
    @SerializedName("systems")
    @Expose
    private Systems systems;

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

    public Systems getSystems() {
        return systems;
    }

    public void setSystems(Systems systems) {
        this.systems = systems;
    }

}
