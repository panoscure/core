
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bets {

    @SerializedName("selections")
    @Expose
    private List<Selection_> selections = null;
    @SerializedName("systems")
    @Expose
    private List<System_> systems = null;

    public List<Selection_> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection_> selections) {
        this.selections = selections;
    }

    public List<System_> getSystems() {
        return systems;
    }

    public void setSystems(List<System_> systems) {
        this.systems = systems;
    }

}
